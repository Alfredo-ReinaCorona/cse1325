#ifndef matrix3
#define matrix3

/*int matrix(int matrix1[3][3], int matrix2[3][3])
{
    public:
    int i,j,x,y;


    std::cout<<"Enter values for the matricies\n"<<std::endl;

    for(x=0;x<3;x++)
    {
        for(y=0;y<3;y++)
        {
            std::cin>>matrix1[x][y];
        }
    }

    std::cout<<"\n\n";

    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            std::cin>>matrix2[i][j];
        }
    }
    return 1;   
}*/

//public:
/*class matrix
{
public:*/

int m1[3][3];
int m2[3][3];
int data[3][3];
int a, b, i, j, x, y;

int operator1()
{
    //std::cout<<"\nEnter values for the matricies:\n"<<std::endl;

    for(x=0;x<3;x++)
    {
        for(y=0;y<3;y++)
        {
            std::cin>>m1[x][y];
        }
    }

    std::cout<<"\n";

    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            std::cin>>m2[i][j];
        }
    }
    return 1;
}
//public:
int operator2()
{
    for(a=0;a<3;a++)
    {  
        b=0;
        std::cout<<m1[a][b]<<" "<<m1[a][b+1]<<" "<<m1[a][b+2]<<std::endl;
        //std::cout<<"\n"<<std::endl;
    }

    std::cout<<"+\n"<<std::endl;

    for(a=0;a<3;a++)
    {
        b=0;
        std::cout<<m2[a][b]<<" "<<m2[a][b+1]<<" "<<m2[a][b+1]<<std::endl;  
    }

    std::cout<<"= \n"<<std::endl;

    return 1;
}
//public:
int operator3()
{
    for(a=0;a<3;a++)
    {
        for(b=0;b<3;b++)
        {
            data[a][b]=m1[a][b]+m2[a][b];
        }
    }
    
     for(a=0;a<3;a++)
    {
        b=0;
        std::cout<<data[a][b]<<" "<<data[a][b+1]<<" "<<data[a][b+2]<<std::endl;
    }
    return 1;
}

int operator4()
{
    int scalar=1;
    std::cout<<"Fill the matrix:  "<<std::endl;
   
    for(x=0;x<3;x++)
    {
        for(y=0;y<3;y++)
        {
            std::cin>>m1[x][y];
        }
    }

    std::cout<<"Enter a scalar:  "<<std::endl;
    std::cin>>scalar;
    std::cout<<"\n"<<std::endl;

    for(a=0;a<3;a++)
    {  
        b=0;
        std::cout<<m1[a][b]<<" "<<m1[a][b+1]<<" "<<m1[a][b+2]<<std::endl;
        //std::cout<<"\n"<<std::endl;
    }
    std::cout<<"*\n"<<scalar<<"\n\n=\n"<<std::endl;

    for(a=0;a<3;a++)
    {  
        b=0;
        std::cout<<scalar*m1[a][b]<<" "<<scalar*m1[a][b+1]<<" "<<scalar*m1[a][b+2]<<std::endl;
        //std::cout<<"\n"<<std::endl;
    }

    return 0;
}
//};

#endif
