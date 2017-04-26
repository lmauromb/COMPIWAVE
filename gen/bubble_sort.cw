# Prueba de Bubble Sort

begin
    main
    {
        int size = 10;
        int Arreglo[10];
        int i = 0;

        Arreglo[0] = 10;
        Arreglo[1] = 9;
        Arreglo[2] = 8;
        Arreglo[3] = 7;
        Arreglo[4] = 6;
        Arreglo[5] = 5;
        Arreglo[6] = 4;
        Arreglo[7] = 3;
        Arreglo[8] = 2;
        Arreglo[9] = 1;

        while(i < size){
            int j = i + 1;
            while(j < size){
                if(Arreglo[i] > Arreglo[j]){
                    int temp = Arreglo[i];
                    Arreglo[i] = Arreglo[j];
                    Arreglo[j] = temp;
                }
                j = j + 1;
            }
            i = i + 1;
        }

        i = 0;

        while(i < size){
            print(Arreglo[i]);
            i = i + 1;
        }

    }

end