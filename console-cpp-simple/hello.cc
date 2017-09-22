// Simple Hello World
 
#include <iostream>
/**
 * @author Will
 * @version 1.0
 */
int sumar(int a, int b){
    return a+b;
}
int restar(int a, int b){
    return a-b;
} 
int multiplicar(int a, int b){
    return a*b;
}
int dividir(int a, int b){
    return a/b;
}
void sumapunteros(int,int,int*);
void restapunteros(int,int,int*);
void multiplicacionpunteros(int,int,int*);
void divisionpunteros(int,int,int*);
int main()
{
  int resultado1 = sumar(5, 7);
  int resultado2 = restar(10, 7);
  int resultado3 = multiplicar(5, 4);
  int resultado4 = dividir(10, 2);
  std::cout << "Calculadora por valor" << std::endl;
  std::cout << "Suma: " << resultado1 << std::endl;
  std::cout << "Resta: " << resultado2 << std::endl;
  std::cout << "Multiplicacion: " << resultado3 << std::endl;
  std::cout << "Division: " << resultado4 << std::endl;
  int resultado5;
  int resultado6;
  int resultado7;
  int resultado8;
  sumapunteros(8,5,&resultado5);
  restapunteros(12,3,&resultado6);
  multiplicacionpunteros(10,4,&resultado7);
  divisionpunteros(20,4,&resultado8);
  std::cout << "Calculadora por Referencia" << std::endl;
  std::cout << "Suma: " << resultado5 << std::endl;
  std::cout << "Resta: " << resultado6 << std::endl;
  std::cout << "Multiplicacion: " << resultado7 << std::endl;
  std::cout << "Division: " << resultado8 << std::endl;
  return 0;
}

void sumapunteros(int a, int b, int* resultado){
    *resultado = a + b;
}
void restapunteros(int a, int b, int* resultado){
    *resultado = a - b;
}
void multiplicacionpunteros(int a, int b, int* resultado){
    *resultado = a * b;
}
void divisionpunteros(int a, int b, int* resultado){
    *resultado = a / b;
}