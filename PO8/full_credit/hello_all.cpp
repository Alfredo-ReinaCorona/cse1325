#include <iostream>
#include <string>
#include <algorithm>


int main(int argc, char** argv)
{
    std::string name;

    std::cout<<"What is your name \n";

    std::getline(std::cin,name);

    std::cout<<"Hello "<<name<<"!\n";


}
