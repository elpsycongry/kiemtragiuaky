Thêm dữ liệu
INSERT INTO computer (name, manufacturer, type, operatingSystem, cpu, ram, storage, gpu, display, price, manufactureDate, status, description)
VALUES
    ('Dell XPS 15', 'Dell', 'Laptop', 'Windows', 'Intel Core i7', 16, 512, 'NVIDIA GeForce GTX 1650 Ti', '15.6 inch 4K UHD', 1999.99, '2022-01-15', 'Active', 'Premium laptop for professionals'),/n
    ('HP Pavilion Desktop', 'HP', 'Desktop', 'Windows', 'AMD Ryzen 5', 8, 256, 'Integrated Radeon Graphics', '21.5 inch FHD', 699.99, '2021-12-20', 'Active', 'Affordable desktop for home use'),
    ('Asus ZenBook 14', 'Asus', 'Laptop', 'Windows', 'Intel Core i5', 8, 256, 'Integrated Intel UHD Graphics', '14 inch FHD', 899.99, '2022-02-10', 'Active', 'Compact and lightweight laptop for travelers'),
    ('Lenovo ThinkCentre M70q', 'Lenovo', 'Desktop', 'Windows', 'Intel Core i3', 8, 128, 'Integrated Intel UHD Graphics 630', 'N/A', 549.99, '2021-11-05', 'Active', 'Small form factor desktop for office use'),
    ('Apple MacBook Air', 'Apple', 'Laptop', 'macOS', 'Apple M1', 8, 256, 'Integrated Apple 7-core GPU', '13.3 inch Retina Display', 999.99, '2022-03-02', 'Active', 'Sleek and lightweight laptop with long battery life');

Để test sử dụng các lệnh sau đây
Lấy danh sách computer
GET http://localhost:8080/api/computers
Lấy theo phân trang
GET http://localhost:8080/api/computers/package?page=2&size=1
Lấy danh sách theo tên
GET http://localhost:8080/api/computers/search?value=PS
Lấy theo id
GET http://localhost:8080/api/computers/1

