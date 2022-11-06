#include <iostream>
#include "matrix3.cpp"

/*int main() 
{
    int m1[3][3];
    int m2[3][3];
    int data[3][3];
    int a,b;

    std::cout<< matrix(m1,m2) <<std::endl;

    std::cout<<"\033[2J\033[1;1H";

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
        //std::cout<<"\n"<<std::endl;
    }

    std::cout<<"= \n"<<std::endl;

    for(a=0;a<3;a++)
    {
        for(b=0;b<3;b++)
        {
            msum[a][b]=m1[a][b]+m2[a][b];
        }
        //std::cout<<"\n"<<std::endl;
    }
    
     for(a=0;a<3;a++)
    {
        b=0;
        std::cout<<data[a][b]<<" "<<data[a][b+1]<<" "<<data[a][b+2]<<std::endl;
    }


    return 0;
}*/

int main(int argc, char** argv)
{
    std::cout<< operator1() <<std::endl;

    std::cout<< operator2() <<std::endl;

    std::cout<< operator3() <<std::endl;
}

