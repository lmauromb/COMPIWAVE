begin
    main
    {
        int a;
        int b;
        int c;
        int d;

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