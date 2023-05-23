create table if not exists public.proveedores
(
    fecha_alta   timestamp(6),
    id_cliente   bigint,
    id_proveedor bigserial primary key,
    nombre       varchar(255)
);

