begin

    int i;
    int j;

    function void uno(int a){
        i = a * 2;
        if(i < a + 4){
            uno(a+1);
        }
        print(i);
    }

    function int dos(int b){
        b = b * i + j;
        return b * 2;
    }

    main
    {
        i = 2;
        j = i * 2 - 1;
        uno(j);
        print(i + dos(i + j));
    }

end