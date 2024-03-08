package com.example.crud7.model;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Hãng sản xuất không được để trống")
    private String manufacturer;

    @NotBlank(message = "Loại máy tính không được để trống")
    private String type;

    @NotBlank(message = "Hệ điều hành không được để trống")
    private String operatingSystem;

    @NotBlank(message = "CPU không được để trống")
    private String cpu;

    @NotNull(message = "RAM không được để trống")
    @Min(value = 1, message = "RAM phải lớn hơn 0")
    private Integer ram;

    @NotNull(message = "Bộ nhớ trong không được để trống")
    @Min(value = 1, message = "Bộ nhớ trong phải lớn hơn 0")
    private Integer storage;

    private String gpu;

    private String display;

    @NotNull(message = "Giá bán không được để trống")
    @Positive(message = "Giá bán phải là số dương")
    private Double price;

    @NotNull(message = "Ngày sản xuất không được để trống")
    @Past(message = "Ngày sản xuất phải là ngày trong quá khứ")
    private Date manufactureDate;

    @NotBlank(message = "Trạng thái không được để trống")
    private String status;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
