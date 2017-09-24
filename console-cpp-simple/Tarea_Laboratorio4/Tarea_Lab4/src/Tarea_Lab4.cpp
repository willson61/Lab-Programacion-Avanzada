//============================================================================
// Name        : Tarea_Lab4.cpp
// Author      : Williams Monterroso
// Version     : 1.0
// Copyright   : Your copyright notice
// Description : Tarea de Laboratorio 4 de Programacion Avanzada
//============================================================================

#include <iostream>
using namespace std;
void tablaMultiplicar(int num);
int* ingresoDatos(int[], int);
void mostrarDatos(int[], int);
void mostrarSuma(int[], int);
void mostrarSumaPares(int[], int);
void mostrarSumaImpares(int[], int);
void ordenarDatos(int[], int);
int main() {
	int input;
	cout << "Ejercisio 1" << endl;
	cout << "Ingrese el numero del que desea la tabla de multiplicacion" << endl;
	cin >> input;
	tablaMultiplicar(input);
	cout << "Ejercisio tarea" << endl;
	cout << "Ingrese la cantiad de datos que ingresara" << endl;
	cin >> input;
	int arreglo2[input];
	int * arreglo;
	arreglo = ingresoDatos(arreglo2, input);
	mostrarDatos(arreglo2, input);
	mostrarSuma(arreglo2, input);
	cout << "La longitud del arreglo es de : " << input << endl;
	mostrarSumaPares(arreglo2, input);
	mostrarSumaImpares(arreglo2, input);
	ordenarDatos(arreglo2, input);
	return 0;
}
/**
 * @param num	Integer del que se creara la tabla de multiplicacion
 */
void tablaMultiplicar(int num){
	int arreglo1 [10];
	for(int i=0; i<10; i++){
		arreglo1[i]= (i + 1) * num;
	}
	for(int i=0; i<10; i++){
		cout << i + 1 << " * " << num << " = " << arreglo1[i] << endl;
	}
}
/**
 * @param temp[]	Array temporal en el que se ingresaran los datos
 * @param cant		Integer que determina el limite de ingreso de datos
 */
int * ingresoDatos(int temp[], int cant){
	for(int i = 0; i < cant; i++){
		cout << "Ingrese el entero numero " << i + 1 << " que desea guardar" <<endl;
		cin >> temp[i];
	}
	return temp;
}
/**
 * @param temp[]	Array temporal en el estan almacenados los daots
 * @param cant		Integer que determina el limite de ingreso de datos
 */
void mostrarDatos(int temp[], int cant){
	cout << "Los datos ingresados son:" << endl;
	for(int i = 0; i < cant; i++){
		cout << temp[i] << endl;
	}
}
/**
 * @param temp[]	Array temporal en el estan almacenados los daots
 * @param cant		Integer que determina el limite de ingreso de datos
 */
void mostrarSuma(int temp[], int cant){
	//sum	Integer donde se almacena la suma de los datos
	int sum = 0;
	cout << "La suma de los datos ingresados es: " << endl;
	for(int i = 0; i < cant; i++){
			sum = sum + temp[i];
	}
	cout << sum << endl;
}
/**
 * @param temp[]	Array temporal en el estan almacenados los daots
 * @param cant		Integer que determina el limite de ingreso de datos
 */
void mostrarSumaPares(int temp[], int cant){
	//suma	Integer donde se almacena la suma de los datos pares
	int suma;
	cout << "La suma de los datos pares ingresados es: " << endl;
	for(int i = 0; i < cant; i++){
		if((temp[i] % 2) == 0){
			suma = suma + temp[i];
		}
	}
	cout << suma << endl;
}
/**
 * @param temp[]	Array temporal en el estan almacenados los daots
 * @param cant		Integer que determina el limite de ingreso de datos
 */
void mostrarSumaImpares(int temp[], int cant){
	//suma1	Integer donde se almacena la suma de los datos impares
	int suma1;
	cout << "La suma de los datos impares ingresados es: " << endl;
	for(int i = 0; i < cant; i++){
		if((temp[i] % 2) != 0){
			suma1 = suma1 + temp[i];
		}
	}
	cout << suma1 << endl;
}
/**
 * @param temp[]	Array temporal en el estan almacenados los daots
 * @param cant		Integer que determina el limite de ingreso de datos
 */
void ordenarDatos(int temp[], int cant){
	//tem	Integer que almacena los datos en el proceso de ordenamiento
	int tem;
	for(int i = 0; i < cant;i++){
		for(int j = 0; j<cant-1;j++){
			if(temp[j] > temp[j+1]){
				tem = temp[j];
				temp[j]=temp[j+1];
				temp[j+1]=tem;
			}
		}
	}
	cout << "Los datos ingresados de manera ascendente son:" << endl;
		for(int i = 0; i < cant; i++){
			cout << temp[i] << endl;
		}
}
