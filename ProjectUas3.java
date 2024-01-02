/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjectUas3;

/**
 *
 * @author User
 * Nama : Bintang Fajar Nusantara
 * Nim : 22205028
 * Jurusan : Teknik Informatika/22
 */

abstract class ProjectUas3Employee {

    private String name;

    public ProjectUas3Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();
}

class ProjectUas3Manager extends ProjectUas3Employee {

    public ProjectUas3Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Memimpin tim");
    }
}

class ProjectUas3Developer extends ProjectUas3Employee {

    public ProjectUas3Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Membuat aplikasi");
    }
}

class ProjectUas3Designer extends ProjectUas3Employee {

    public ProjectUas3Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Membuat desain");
    }
}

public class ProjectUas3 {

    public static void main(String[] args) {
        ProjectUas3Manager manajer = new ProjectUas3Manager("zalfa");
        ProjectUas3Developer pengembang = new ProjectUas3Developer("Jane Doe");
        ProjectUas3Designer desainer = new ProjectUas3Designer("John Smith");

        manajer.work();
        pengembang.work();
        desainer.work();
    }
}
