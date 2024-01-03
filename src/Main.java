import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Выберите на компьютере любую папку,
        // в которой содержится не менее 3-ёх документов и 3-ёх директорий.
        // Вам необходимо вывести название каждого элемента в выбранной папке:
        // его длину и принадлежность к директории (метод isDirectory()).

        File dir = new File("D:/Кирилл/Учеба IT/IT OVERONE/Уроки");
        if (dir.isDirectory()){
            System.out.println("Директория найдена: ");
            System.out.println("Путь: " + dir.getAbsolutePath());
            for (File item: dir.listFiles()){
                if (item.isDirectory()){
                    System.out.println("\t (папка) - " + item.getName());
                }else {
                    System.out.println("\t (файл) - " + item.getName() + " Длина: " + item.getAbsoluteFile().length());
                }
            }
        }else {
            System.out.println("Директрия не найдена!");
        }
    }
}