# Arquitectura de la Máquina Virtual

Una **máquina virtual** simula una computadora con los siguientes componentes:

- Code memory: Este arreglo contiene la lista de instrucciones a ejecutar (cuadruplos),
especificando sus direcciones y sus operandos
- ip register: *Instruction Pointer* es un apuntador que apunta a la siguiente
instruccion (code memory) a ejecutar.
- Global memory: Contiene un numero fijo de casillas en donde se guardan las variables.
    - Variables Int Globales: 5000
    - Variables Float Globales: 10000
    - Variables String Globales: 15000
    - Variables Boolean Globales: 20000
    - Variables Int Locales: 25000
    - Variables Float Locales: 30000
    - Variables String Locales: 15000
    - Variables Boolean Locales: 20000
- CPU: Para ejecutar las instrucciones. Es un loop que encierra un switch del cuadruplo.
- Constant Pool: Direccion de las variables contantes.
    - Inician en la direccion 50000
- Function call stack: Stack que guarda los valores de retorno, los parametros,
 y las variables locales de las funciones.
- fp register: apuntador que apunta al tope del stack de function call.

