# Prueba de Bubble Sort

begin
    main
    {
        int size = 10;
        int arreglo[10];
        int i = 0;

        arreglo[0] = 10;
        arreglo[1] = 9;
        arreglo[2] = 8;
        arreglo[3] = 7;
        arreglo[4] = 6;
        arreglo[5] = 5;
        arreglo[6] = 4;
        arreglo[7] = 3;
        arreglo[8] = 2;
        arreglo[9] = 1;

        while(i < size){
            int j = i + 1;
            while(j < size){
                if(arreglo[i] > arreglo[j]){
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
                j = j + 1;
            }
            i = i + 1;
        }

        i = 0;

        while(i < size){
            print(arreglo[i]);
            i = i + 1;
        }

    }

end