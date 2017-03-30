begin
    main
    {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        if (a+b > d)
        {
            if (a<b)
            {
                a = 0;
                b = b + d;
            }
            else
            {
                c = a + b;
            }
        }
        else
        {
            a = b + c;
        }

        d = b + a * c;

    }
end