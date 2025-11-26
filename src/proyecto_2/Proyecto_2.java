/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_2;

import java.io.File;
import java.text.Collator;

/**
 *
 * @author Daniela
 */
public class Proyecto_2 {

    /**
     * Instancias públicas de la clase
     */
    public static String strappfile = System.getProperty("java.io.tmpdir") + "proyecto_2.txt";
    public static File appfile = new File(strappfile);
    public static String[] Proj_Tit = new String[100];
    public static String[] Proj_Sum = new String[100];
    public static String[] Auth = new String[100];
    public static String[] Key = new String[100];
    public static int[][] Proj_Auth = new int [100][100];
    public static int[][] Proj_Key = new int [100][100];
    public static int[][] Auth_Proj = new int [100][100];
    public static int[][] Key_Proj = new int [100][100];
    public static AVL arb_author = new AVL();
    public static AVL arb_keywords = new AVL();    
    public static Interfaz interf = new Interfaz();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        if(appfile.exists())
        {
            LoadDefault.ReadAppFile();
        }
        else
        {
            LoadDefault.DefaultsProjects();
            LoadDefault.SaveData();
        }
        fillarbol("Author");
        fillarbol("Key");
        interf.setVisible(true);
    }
        
          
    public static Boolean AddProject(String Title, String Summary, String[] Authors, String[] Keys)
    {
        /**
         * Agrega la investigación almacenando la información en los arreglos
         */
        Boolean flag = false;
        Boolean flag_continue = false;
        int HashProj;
        int HashAuthor;
        int HashKey;
        Hash Obj = new Hash();
        HashProj = Obj.getHashCode(Title);
        if(isHashEmpty(HashProj, "Project"))
        {
            flag_continue = true;
        }
        else
        {
            if(!Proj_Tit[HashProj].equals(Title))
            {
                while(!isHashEmpty(HashProj, "Project")) 
                {
                    Title += " ";
                    HashProj = Obj.getHashCode(Title);
                }
                flag_continue = true;
            }
        }
        if(flag_continue)
        {
            Proj_Tit[HashProj] = Title;
            Proj_Sum[HashProj] = Summary;
            for(String Author : Authors)
            {
                HashAuthor = Obj.getHashCode(Author);
                if(isHashEmpty(HashAuthor, "Author"))
                {
                    Auth[HashAuthor] = Author;
                    
                }
                else
                {
                    if(!Auth[HashAuthor].equals(Author))
                    {        
                        while(!isHashEmpty(HashAuthor, "Author")) 
                        {
                            Author += " ";
                            HashAuthor = Obj.getHashCode(Author);
                        }
                        Auth[HashAuthor] = Author;
                    }
                }
                arb_author.insertroot(Author);
                for(int i=0; i<Proj_Auth[HashProj].length; i++)
                {
                    if(Proj_Auth[HashProj][i] == 0)
                    {
                        Proj_Auth[HashProj][i] = HashAuthor;
                        break;
                    }
                }
                for(int i=0; i<Auth_Proj[HashAuthor].length; i++)
                {
                    if(Auth_Proj[HashAuthor][i] == 0)
                    {
                        Auth_Proj[HashAuthor][i] = HashProj;
                        break;
                    }
                }
            }
            
            for(String KeyV : Keys)
            {
                HashKey = Obj.getHashCode(KeyV);
                if(isHashEmpty(HashKey, "Key"))
                {
                    Key[HashKey] = KeyV;
                    
                }
                else
                {
                    if(!Key[HashKey].equals(KeyV))
                    {        
                        while(!isHashEmpty(HashKey, "Key")) 
                        {
                            KeyV += " ";
                            HashKey = Obj.getHashCode(KeyV);
                        }
                        Key[HashKey] = KeyV;
                    }
                }
                arb_keywords.insertroot(KeyV);
                for(int i=0; i<Proj_Key[HashProj].length; i++)
                {
                    if(Proj_Key[HashProj][i] == 0)
                    {
                        Proj_Key[HashProj][i] = HashKey;
                        break;
                    }
                }
                for(int i=0; i<Key_Proj[HashKey].length; i++)
                {
                    if(Key_Proj[HashKey][i] == 0)
                    {
                        Key_Proj[HashKey][i] = HashProj;
                        break;
                    }
                }
            }
            flag = true;
        }
        return flag;
    }
        
    public static Boolean isHashEmpty(int Code, String Type)
    {
        /**
         * Verifica si el indice está ocupado
         */
        boolean flagEmpty;
        String[] Value;
        switch(Type)
        {
            case "Project":
                Value = Proj_Tit;
                break;
            case "Author":
                Value = Auth;
                break;
            case "Key":
                Value = Key;
                break;
            default:
                Value = Proj_Tit;
        }
        
        if(Value[Code] == null)
        {
            flagEmpty = true;
        }
        else 
        {
            flagEmpty = false;
        }
        return flagEmpty;
    }

    public static String[] OrderStringArray(String[] DataArray)
    {
        /**
         * Ordena el arreglo de forma alfabética
         */
        String[] Result = new String[1];
        Result[0] = DataArray[0];
        int index = -1;
        Collator col = Collator.getInstance();
        for(int i=1; i<DataArray.length; i++)
        {
            String[] tmpResult = new String[Result.length + 1];
            index = -1;
            for(int j=0; j<Result.length; j++)
            {
                int comp = col.compare(Result[j], DataArray[i]);
                if(comp >= 0)
                {
                    index = j;
                    tmpResult[j] = DataArray[i];
                    break;
                }
                else
                {
                    tmpResult[j] = Result[j];
                }
            }
            if(index == -1)
            {
                tmpResult[tmpResult.length - 1] = DataArray[i];
            }
            else
            {
                for(int k=index; k<Result.length; k++)
                {
                    tmpResult[k+1] = Result[k];
                }
            }
            Result = tmpResult;
        }
        return Result;
    }
    
    private static void fillarbol(String Type)
    {
        /**
         * 
         */
        String[] Value;
        switch(Type)
        {
            case "Author":
                Value = Auth;
                break;
            case "Key":
                Value = Key;
                break;
            default:
                Value = Auth;
        }
        for(int i=0; i<Value.length; i++)
        {
            if(Value[i]!=null)
            {
                if(Type.equals("Author"))
                {
                    arb_author.insertroot(Value[i]);
                }
                else
                {
                    arb_keywords.insertroot(Value[i]);
                }    
            }
        }
    }
}
