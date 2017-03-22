begin
    int i = 9;
    function float f(int x, float y)
    {
        float j;
        { float z = i+1; i = z; }
        return i;
    }
    main
    {
        { { { { float x; } } } }
        boolean b;
        f(i,2);
    }
end