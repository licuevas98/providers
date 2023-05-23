DELETE FROM proveedores;

INSERT INTO proveedores
    (id_proveedor, nombre, fecha_alta, id_cliente)
VALUES
    (1, 'Coca-cola', '2022-01-01', 5),
    (2, 'Pepsi', '2022-01-01', 5),
    (3, 'Redbull', '2022-01-01', 6),
    (4, 'Fanta', '2022-01-01', 7),
    (5, 'Casera', '2022-01-01', 8),
    (6, 'Trina', '2022-01-01', 6);
