/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19myarray;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        System.out.println("Программа MyArray");
        System.out.println("Создать массив типа int с названием myArray с 20 ячейками");
        int myArray[] = new int [20];
        System.out.println("Заполнить массив случайными значениями в диапазоне от 0 до 50");
        Random random = new Random();
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(49 - 0 + 1) - 0;
        }
        System.out.println("Вывести значение массива на экран");
        for(int i = 0; i < myArray.length; i++){
            System.out.printf("%3d",myArray[i]); 
        }
        System.out.println();
        System.out.println("Значение в обратном порядке");
        for(int i = myArray.length - 1; i >= 0; i--){
            System.out.printf("%3d",myArray[i]);
        }
        System.out.println();
        System.out.println("Сумма ячеек");
        int sum = 0;
        for(int i = 0; i < myArray.length; i++){
            sum = sum + myArray[i];
        }
        System.out.println(sum);
        System.out.println("Первая половина массива");
        int[]copiedArray = new int [10];
        System.arraycopy(myArray, 0, copiedArray, 0, 10);
        System.out.println(Arrays.toString(copiedArray));
        
        System.out.println("Вторая половина массива");
        int[]copiedArray_2 = new int [10];
        System.arraycopy(myArray, 0, copiedArray_2, 9, 10);
        System.out.println(Arrays.toString(copiedArray_2));
        }
    }
