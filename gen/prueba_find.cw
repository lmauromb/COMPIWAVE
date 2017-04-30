begin

    main
    {

        int arreglo[3];
        int i = 0;
        arreglo[0] = 10;
        arreglo[1] = 9;
        arreglo[2] = 8;
        boolean b = False;

        while(i < 3){
            if(arreglo[i] == 7){
                b = True;
            }
            i = i + 1;
        }

        if(b){
            print("Encontrado");
        } else {
            print("No Encontrado");
        }
    }

end