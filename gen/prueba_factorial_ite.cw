# Prueba de Factorial Iterativo

begin

    main
    {
        int num = 5;
        int fact = 1;
        int i = 1;
        while(i < num + 1){
            fact = fact * i;
            i = i + 1;
        }
        print(fact);
    }

end