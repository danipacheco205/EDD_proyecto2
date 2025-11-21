/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

/**
 *
 * @author Daniela
 */
public class LoadDefault {
    
    public LoadDefault()
    {

    }
    
    public static void DefaultsProjects()
    {
        String Title;
        String[] Authors;
        String Summary;
        String[] Keys;
        
        Title = "Interacción inalámbrica con dispositivos de bajo costo para pantallas horizontales";
        Authors = new String[] {"Rhadamés Carmona","Marcos Ramírez"};        
        Summary = "El Centro de Computación Gráfica de la UCV cuenta con una mesa de proyección horizontal o ";
        Summary += "Workbench, en donde se proyectan imágenes estereoscópicas. Actualmente, la interacción con ";
        Summary += "la mesa de trabajo se logra con dispositivos cableados, los cuales son costosos, pueden ";
        Summary += "resultar incómodos, y limitan los movimientos del usuario. En este trabajo se propone ";
        Summary += "utilizar los controles de la consola de videojuegos Wii, los cuales se pueden comunicar ";
        Summary += "con el computador vía bluetooth. El rastreo de la posición de la cabeza del usuario se ";
        Summary += "logra colocando unos leds infrarrojos en los lentes estereoscópicos para triangular con ";
        Summary += "el control del Wii y determinar su posición. Con la posición del usuario, se realiza el ";
        Summary += "despliegue estereoscópico para lograr el efecto 3D deseado. También se logra la ";
        Summary += "manipulación de los objetos de la escena con otro control del Wii. Estas funcionalidades ";
        Summary += "son encapsuladas en una librería para su posterior uso en aplicaciones que requieran de ";
        Summary += "la interacción con la pantalla de proyección.";
        Keys = new String[] {"rastreo de cabeza", "interacción humano-computador", "realidad virtual"};
        Proyecto_2.AddProject(Title, Summary, Authors, Keys);

        Title = "Complemento de software para el diseño de fundaciones.";
        Authors = new String[] {"Raquel Sandoval","Iván Loscher","Christian Guillén Drija"};        
        Summary = "El adelanto tecnológico presente hoy en día ha traído una gran cantidad de herramientas útiles ";
        Summary += "ingenieros, incorporando el uso de sistemas de información para la toma de decisiones en los ";
        Summary += "procesos de cálculo y la visualización de materiales creados a través de los cálculos; así como ";
        Summary += "avanza las tecnologías a usar, también deben actualizarse las herramientas para asegurar su ";
        Summary += "durabilidad y fiabilidad en el tiempo. El siguiente trabajo presenta una herramienta que, con ";
        Summary += "ayuda de métodos de cálculo existentes para fundaciones directas e indirectas, genera el diseño ";
        Summary += "de las mismas en conjunto a través de valores ingresados por el usuario, estableciendo así un ";
        Summary += "medio en el que pueda visualizarse de manera eficiente y sencilla los resultados del cálculo ";
        Summary += "previamente establecido, pues automatiza el proceso de dibujo y cálculo en AutoCAD. Dicha ";
        Summary += "herramienta se implementó como un complemento o extensión de software que permite el diseño y ";
        Summary += "dibujo de las fundaciones con base en las librerías, funciones y modelos de AutoCAD. La extensión ";
        Summary += "obtenida puede ser modificada en el tiempo para extender sus funcionalidades. La misma implementa ";
        Summary += "diversos métodos para diseño de fundaciones, entre los que se cuenta Caquot-Kerisel y Meyerhof, ";
        Summary += "aplicado en las fundaciones indirectas. En el caso de las fundaciones directas, implementa ";
        Summary += "el método de Terzaghi y Vesic. Igualmente, se realizó un modelo de cálculo para el diseño ";
        Summary += "de todas las fundaciones de la estructura, el cual fue implementado en el complemento obtenido ";
        Summary += "en este trabajo de investigación.";
        Keys = new String[] {"fundaciones directas", "AutoCAD", "complemento", "C#"};
        Proyecto_2.AddProject(Title, Summary, Authors, Keys);
        
        Title = "Arquitectura referencial para mecanismos de Internacionalización y localización en PHP.";
        Authors = new String[] {"Christian Guillén Drija","Andrea Pérez","Carlos Maldonado"};        
        Summary = "Los procesos de internacionalización y localización inciden directamente en la usabilidad de ";
        Summary += "un sistema web al facilitar su adaptación a diferentes elementos culturales tales como la ";
        Summary += "moneda, idioma, formato de fecha, sistema de medidas, entre otros. Algunos frameworks para ";
        Summary += "aplicaciones web cuentan con soporte para dichos procesos. Sin embargo, en muchas ocasiones, ";
        Summary += "la información sobre la arquitectura de los mecanismos utilizados en cada framework, así como ";
        Summary += "su funcionamiento interno, resulta insuficiente. La arquitectura de software se corresponde a ";
        Summary += "visión abstracta de un sistema en la que se representan los componentes del mismo, el ";
        Summary += "comportamiento de cada uno de dichos elementos y la forma en que se relacionan. Su uso adecuado ";
        Summary += "conlleva la disminución de los costos de manutención del software, mayor facilidad en la toma de ";
        Summary += "decisiones de diseño, disminución de las fallas, entre otras ventajas. Por otra parte, la ";
        Summary += "generación de una Arquitectura de Referencia (AR), es el producto con mayor relevancia generado ";
        Summary += "en la etapa de Análisis del Dominio (AD), dentro de la denominada disciplina de Ingeniería del ";
        Summary += "Dominio (ID), la cual tiene gran relevancia para el desarrollo de software basado en componentes. ";
        Summary += "En este trabajo, se aplica un AD, asumiendo un enfoque ascendente (“bottom-up”) sobre una muestra ";
        Summary += "de frameworks de desarrollo para PHP, específicamente centrado en los mecanismos que cada ";
        Summary += "framework implementa para posibilitar la internacionalización y la localización en aplicaciones ";
        Summary += "web. Para lograr lo anterior, se aplicó ingeniería inversa sobre las distintas arquitecturas y ";
        Summary += "se modelaron en UML. Del análisis de las variantes e invariantes de las mismas, se obtuvo una ";
        Summary += "Arquitectura de Referencia para un subsistema de internacionalización y localización. Si bien la ";
        Summary += "muestra de arquitecturas analizadas en este trabajo se circunscriben a frameworks de desarrollo ";
        Summary += "en PHP, la Arquitectura de Referencia obtenida puede ser considerada de carácter genérico, con ";
        Summary += "el suficiente nivel de abstracción de manera que pueda ser asumida como una arquitectura base ";
        Summary += "sobre la cual comenzar un desarrollo basado en componentes; sin embargo, su validación puede ";
        Summary += "realizarse a través de la ampliación de la muestra inicial de frameworks seleccionados y el ";
        Summary += "análisis de las posibles variantes que puedan generarse. No obstante, la Arquitectura de ";
        Summary += "Referencia obtenida en este ejercicio de Análisis de Dominio puede utilizarse como referente ";
        Summary += "dentro de una organización para evaluar la mejor opción al momento de seleccionar la alternativa ";
        Summary += "arquitectónica más robusta al considerar un conjunto de frameworks de desarrollo.";
        Keys = new String[] {"análisis de dominio", "ingeniería de dominio", "PHP", "arquitectura referencial", "internacionalización y localización"};
        Proyecto_2.AddProject(Title, Summary, Authors, Keys);        

        Title = "Sistema de diseño basado en Grid";
        Authors = new String[] {"José Invernón","Christian Guillén Drija"};        
        Summary = "Los frameworks de diseño son conjuntos articulados de elementos y componentes gráficos que se ";
        Summary += "rigen por patrones o guías de diseño. Estos favorecen el desarrollo rápido de aplicaciones web ";
        Summary += "sobre la base de criterios de diseño consistentes. La mayoría de los frameworks de Frontend, ";
        Summary += "basan su implementación en elementos que se distribuyen en una sola dimensión, es decir, hacen ";
        Summary += "uso de Flexbox, lo cual limita el control estructural del contenido. El presente estudio, estuvo ";
        Summary += "centrado en la realización de un sistema de diseño basado en Grid para interfaces gráficas de ";
        Summary += "aplicaciones web. Para ello, se categorizaron los elementos de las guías de diseño de UX/UI ";
        Summary += "del sistema planteado, los cuales componen los patrones que permiten definir el estilo de sus ";
        Summary += "componentes. Posteriormente, se hizo una comparación entre los siguientes frameworks: Bootstrap, ";
        Summary += "Clarity Design y Material Design, con el fin de seleccionar los componentes de interfaz que ";
        Summary += "constituyen el sistema de diseño propuesto en este trabajo de investigación. En una siguiente ";
        Summary += "fase, se procedió a construir tales componentes con base en las propiedades de Grid. Además, ";
        Summary += "se construyó un caso de estudio al que se le aplicó un conjunto de escenarios de pruebas que ";
        Summary += "permitió validar la efectividad del sistema de diseño basado en Grid como herramienta para la ";
        Summary += "construcción de los componentes de interfaz de usuario en el ámbito del desarrollo de ";
        Summary += "aplicaciones Web. Posteriormente, el sistema de diseño obtenido se aplicó a un caso de estudio ";
        Summary += "que consistió en un catálogo de componentes y guías de estilo. Ambos productos son de dominio ";
        Summary += "público, de manera que los potenciales usuarios del sistema de diseño pueden acceder de manera ";
        Summary += "gratuita a la hoja de estilo que especifica las clases constituyentes, así como a una ";
        Summary += "documentación detallada y extensa sobre su uso. Esta investigación permitió demostrar que es ";
        Summary += "posible diseñar componentes de interfaz de usuario basados en propiedades Grid. Dichas ";
        Summary += "propiedades permiten ordenar y posicionar los elementos del HTML de forma práctica y sencilla, ";
        Summary += "haciendo uso de dos dimensiones; además de facilitar el desarrollo de sitios web responsivos. ";
        Summary += "Aun cuando es posible crear elementos de interfaz de usuario solo con la propiedad Grid, como ";
        Summary += "se demostró en este trabajo, su combinación con Flexbox, potencia la creación tanto de ";
        Summary += "componentes como de aplicaciones debido a que con el primero, se define la estructura y con ";
        Summary += "el segundo, se distribuye el contenido en cada sección.";
        Keys = new String[] {"diseño", "componentes", "sistema de diseño", "Grid", "hojas de estilo", "UX/UI"};
        Proyecto_2.AddProject(Title, Summary, Authors, Keys);        

        Title = "GraphQL vs REST: una comparación desde la perspectiva de eficiencia de desempeño.";
        Authors = new String[] {"Christian Guillén Drija","Reynaldo Quintero","Asher Kleiman"};        
        Summary = "El estilo arquitectónico conocido como Transferencia de Estado Representacional (REST según ";
        Summary += "sus siglas en inglés) ha modelado y estandarizado la comunicación cliente-servidor a través ";
        Summary += "del protocolo de transferencia de hipertexto (HTTP). Según Roy Fielding, creador de REST, este ";
        Summary += "estilo consiste en un conjunto de restricciones arquitectónicas que enfatizan la escalabilidad ";
        Summary += "de las interacciones entre los componentes, así como la generalidad las interfaces utilizadas, ";
        Summary += "el despliegue independiente de dichos componentes, la aplicación de componentes intermediarios ";
        Summary += "para la reducción de la latencia, la preponderancia de la seguridad y la encapsulación de los ";
        Summary += "sistemas Legacy. Como consecuencia, REST se ha convertido en el estilo más aplicado en la ";
        Summary += "comunicación con una Interfaz de Programación de Aplicaciones (API). Por otra parte, GraphQL ";
        Summary += "es una tecnología basada en un lenguaje de consultas de datos para API’s que se ha constituido ";
        Summary += "en una alternativa al estilo REST. En este trabajo de investigación, se realizó una comparación ";
        Summary += "de REST y GraphQL como mecanismos arquitectónicos desde una perspectiva de calidad, ";
        Summary += "específicamente centrada en la Eficiencia de Desempeño, en el marco del estándar ISO/IEC 9126 ";
        Summary += "e ISO/IEC 25000. Las subcaracterísticas de Eficiencia de Desempeño evaluadas fueron: ";
        Summary += "Comportamiento Temporal, Utilización de Recursos y Capacidad. Para cada una de dichas ";
        Summary += "subcaracterísticas, se aplicaron métricas, a saber: para el Comportamiento Temporal se aplicaron ";
        Summary += "las métricas Tiempo de Respuesta y Rendimiento; para la Utilización de Recursos, se aplicaron ";
        Summary += "las métricas: Utilización de la Memoria, Utilización de Caché, Overfetching y Underfetching; ";
        Summary += "y para Capacidad, se aplicaron las métricas Capacidad y Velocidad Bajo Estrés. Para el desarrollo ";
        Summary += "de este trabajo se seleccionó un caso de estudio que permitiera evidenciar las características de ";
        Summary += "los dos mecanismos. Asimismo, para la obtención de datos cuantitativos que permitiesen establecer ";
        Summary += "comparaciones, se diseñaron dos API’s que, con base en el caso de estudio escogido, respondieran ";
        Summary += "fielmente a las restricciones que caracterizan a los dos mecanismos arquitectónicos. Los ";
        Summary += "resultados obtenidos, una vez ejecutados los casos de prueba, permiten inferir que REST posee ";
        Summary += "una mayor rapidez de respuesta que GraphQL. Debido a la naturaleza dinámica de las peticiones ";
        Summary += "que pueden realizarse en las que se puede especificar con mayor granularidad la información ";
        Summary += "requerida a través de consultas anidadas, GraphQL parece ser más eficiente en lo relativo al ";
        Summary += "underfetching y al overfetching. En general, GraphQL debería utilizarse cuando se requiere menor ";
        Summary += "utilización de la memoria, cuando los recursos que la API maneja están estrechamente relacionados ";
        Summary += "y cuando no sea necesario utilizar la totalidad de la información obtenida. Por otra parte, REST ";
        Summary += "debería utilizarse en caso de necesitarse mayor velocidad de respuesta y cuando se requiera ";
        Summary += "utilizar la totalidad de la información de los recursos manejados.";
        Keys = new String[] {"REST", "GraphQL", "cliente-servidor", "mecanismo arquitectónico", "calidad de software"};
        Proyecto_2.AddProject(Title, Summary, Authors, Keys); 
        
        Title = "Segmentación Multicanal de Tumores Cerebrales en Imagenología de Resonancia Magnética con Autómatas Celulares Paralelizados en GPU";
        Authors = new String[] {"Antonio Rueda-Toicen","Rhadamés Carmona"};        
        Summary = "La segmentación de imágenes es el proceso de particionar una imagen en múltiples conjuntos de ";
        Summary += "píxeles o vóxeles que comparten alguna característica visual. Existen diversos métodos de ";
        Summary += "segmentación, entre los cuales encontramos algunos basados en morfología matemática, ";
        Summary += "contornos activos y modelos gráficos probabilísticos. Los métodos basados en autómatas ";
        Summary += "celulares pueden acoplarse a más de uno de estos métodos. Entre los métodos de segmentación ";
        Summary += "basados en autómatas celulares se encuentra el algoritmo GrowCut, el cual define una regla ";
        Summary += "de autómata celular determinístico que simula el crecimiento competitivo de varias colonias ";
        Summary += "de bacterias cuyo territorio es el espacio de la imagen. En este trabajo se presentan nuevas ";
        Summary += "reglas para este tipo de autómatas, así como una metodología para comparar su desempeño y ";
        Summary += "calidad de segmentación en problemas de segmentación de tumores cerebrales para planificación ";
        Summary += "de radiocirugía estereotáctica. Se presentan una comparación de resultados en términos de ";
        Summary += "calidad de segmentación y tiempo de respuesta para un conjunto de reglas y distintos casos ";
        Summary += "de prueba. Adicionalmente, se especifica un patrón de implementación en CUDA que aprovecha ";
        Summary += "la capacidad de paralelismo inherente de los autómatas celulares y un método para la selección ";
        Summary += "no supervisada de la configuración inicial del autómata.";
        Keys = new String[] {"Autómata Celular", "Procesamiento de Imágenes", "Segmentación, GPU"};
        Proyecto_2.AddProject(Title, Summary, Authors, Keys); 
        
    }
}
