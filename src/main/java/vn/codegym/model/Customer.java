package vn.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    /*TODO:
     *       Trong một bảng luôn có một khóa chính là Primary key.
     *       Tương ứng trên entity, sử dụng annotation @Id để
     *       đánh dấu cho properties tương ứng là khóa chính
     *       cho table được tạo bởi entity.
     * */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*TODO: - @GenerateValue: quy định giá trị của khóa chính
            sẽ tự tăng trong database (auto_increment).
    * */
    private int id;

    private String name;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
