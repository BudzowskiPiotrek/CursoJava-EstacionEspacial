# CursoJava-EstacionEspacial
Crea un programa que simule la gestión de una estación espacial internacional. La estación debe tener diferentes
módulos habitables y funcionales (como laboratorios, áreas de descanso, etc.).

Crea una clase Modulo que tenga los siguientes atributos:
• nombre (String)
• capacidad (int) (máximo de personas que puede albergar el módulo)
• tipo (String) (Laboratorio, Habitación, Comedor, etc.)
• habitantes (Array de Strings) (nombres de las personas asignadas al módulo) en el constructor el array de
habitantes se creará vacío con una capacidad de 20 habitantes

Implementa métodos para:
• Agregar habitante: Añade una persona al módulo siempre que no supere la capacidad máxima. (Esto lleva
implícito que creemos una clase persona... )
• Eliminar habitante: Elimina a una persona del módulo por nombre.
• Listar habitantes: Muestra los nombres de todas las personas en el módulo.

Crea una clase EstacionEspacial que gestione varios módulos mediante un array de objetos Modulo. El máximo de
módulos que puede contener la estación espacial es de 20.
• Incluye métodos para agregar un módulo, eliminarlo por nombre y listar todos los módulos con sus detalles.
• Implementa un método que devuelva el número total de habitantes en toda la estación espacial.
• Crea un sistema de búsqueda que permita encontrar en qué módulo está asignada una persona.

En el main, crea una estación espacial con al menos 3 módulos iniciales. Usa un menú para permitir al usuario
agregar/eliminar módulos, asignar/eliminar habitantes y consultar información de la estación.
