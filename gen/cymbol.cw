begin
    int i = 9;
    function float f(int x, float y)
    {
        float i;
        { float z = x+y; i = z; }
        { float z = i+1; i = z; }
        return i;
    }
    main
    {
        f(i,2);
    }
end