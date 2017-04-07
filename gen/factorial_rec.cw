# Prueba de Factorial Recursivo

begin

    function int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num -1);
    }

    main
    {
        print(factorial(5));
    }

end