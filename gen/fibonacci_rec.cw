# Prueba de Fibonacci Recursivo
# 0, 1, 2, 3, 4, 5, 6,  7,  8,  9,  10, 11
# 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

begin

    function int fibonacci(int x){
        if(x < 2) {
            return 1;
        } else {
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }

    main
    {
        print(fibonacci(1));
    }

end