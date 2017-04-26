# Prueba de Fibonacci Iterativo
# 0, 1, 2, 3, 4, 5, 6,  7,  8,  9,  10, 11
# 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

begin

    main
    {
        int num = 5;
        int i = 1;
        int fibo_a = 1;
        int fibo_b = 1;
        int fibo_r = 0;

        while(i < num){
            fibo_r = fibo_a + fibo_b;
            fibo_a = fibo_b;
            fibo_b = fibo_r;
            i = i + 1;
        }

        print(fibo_b);

    }

end