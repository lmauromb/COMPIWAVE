# Prueba Multiplicacion de Matrices:

# Matriz A
# 3 x 3
#   12,7,3
#   4 ,5,6
#   7 ,8,9

# Matriz B
# 3 X 4
#   5,8,1,2
#   6,7,3,0
#   4,5,9,1

# Matriz R
# 3 x 4
#   114, 160, 60, 27
#   74, 97, 73, 14
#   119, 157, 112, 23

begin
    main
    {
        int matrix_A[3][3];
        int matrix_B[3][4];
        int matrix_R[3][4];
        int i = 0;
        int j = 0;
        int k = 0;

        matrix_A[0][0] = 12;
        matrix_A[0][1] = 7;
        matrix_A[0][2] = 3;

        matrix_A[1][0] = 4;
        matrix_A[1][1] = 5;
        matrix_A[1][2] = 6;

        matrix_A[2][0] = 7;
        matrix_A[2][1] = 8;
        matrix_A[2][2] = 9;

        matrix_B[0][0] = 5;
        matrix_B[0][1] = 8;
        matrix_B[0][2] = 1;
        matrix_B[0][3] = 2;

        matrix_B[1][0] = 6;
        matrix_B[1][1] = 7;
        matrix_B[1][2] = 3;
        matrix_B[1][3] = 0;

        matrix_B[2][0] = 4;
        matrix_B[2][1] = 5;
        matrix_B[2][2] = 9;
        matrix_B[2][3] = 1;

        matrix_R[0][0] = 0;
        matrix_R[0][1] = 0;
        matrix_R[0][2] = 0;
        matrix_R[0][3] = 0;

        matrix_R[1][0] = 0;
        matrix_R[1][1] = 0;
        matrix_R[1][2] = 0;
        matrix_R[1][3] = 0;

        matrix_R[2][0] = 0;
        matrix_R[2][1] = 0;
        matrix_R[2][2] = 0;
        matrix_R[2][3] = 0;

        while(i <  3){
            j = 0;
            while(j < 4){
                k = 0;
                while(k < 3){
                    matrix_R[i][j] = matrix_R[i][j] + matrix_A[i][k] * matrix_B[k][j];
                    k = k + 1;
                }
                j = j + 1;
            }
            i = i + 1;
        }

        i = 0;
        j = 0;

        while(i <  3){
            j = 0;
            while(j < 4){
                print(matrix_R[i][j]);
                j = j + 1;
            }
            i = i + 1;
        }

    }
end