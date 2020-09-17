import java.util.Random;
class App {
  public void run(){
      System.out.println("----- Weather -----");
      System.out.println("Задание");
      System.out.println("========================================================");
      System.out.println("Создать зубчаты массив.");
      System.out.println("В котором храниться температура воздух.");
      System.out.println("В нашем городе на весь год.");
      System.out.println("Столбцов -количество дней в месяце.");
      System.out.println("Массив должен содержать 12 строк, количество.");
      System.out.println("Заполните массив случайными числами. Температура");
      System.out.println("Зависит от времени года..");
      System.out.println("Программа должна вывести на экран.");
      System.out.println("* Погоду на указанную дату (месяц, день –пользователь .");
      System.out.println("вводит данные с помощью клавиатуры).");
      System.out.println("* Среднюю температуру по каждому месяцу.");
      System.out.println("========================================================");
      System.out.println();
      System.out.println("Решение");
      System.out.println("Создаем заполняем и выводи зубчатый массив с погодой");
      Random random = new Random();
      int min = -30;
      int max = 30;
      int n = 0;
      int [][] tempInYear = new int [12][];
      for (int i = 0; i < 12; i++) {
          switch (i){
              case 0: min=-30;max=0; n=31; break;
              case 1: min=-30;max=-5; n=31; break;
              case 2: min=-20;max=05; n=31; break;
              case 3: min=-15;max=10; n=31; break;
              case 4: min=-5;max=15; n=31; break;
              case 5: min=5;max=25; n=31; break;
              case 6: min=10;max=30; n=31; break;
              case 7: min=10;max=25; n=31; break;
              case 8: min=5;max=20; n=31; break;
              case 9: min=-5;max=10; n=31; break;
              case 10: min=-10;max=0; n=31; break;
              case 11: min=-15;max=-5; n=31; break;
          }
          tempInYear[i] = new int [n];
          for (int j = 0; j < tempInYear[i].length; j++) {
              tempInYear[i][j]=random.nextInt(max - min + 1)+ min;
              System.out.printf("%4d", tempInYear[i][j]);
              
          }
          System.out.println();
      }
  } 
}
