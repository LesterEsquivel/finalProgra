<%-- 
    Document   : registroOrden
    Created on : 9/11/2024, 8:20:11?a. m.
    Author     : Lester
--%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registrar Orden</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2>Registrar Orden de Trabajo</h2>
        <form action="registrarOrden" method="post">
            <div class="mb-3">
                <label for="fecha" class="form-label">Fecha</label>
                <input type="date" class="form-control" id="fecha" name="fecha" required>
            </div>
            <div class="mb-3">
                <label for="cliente" class="form-label">Cliente</label>
                <input type="text" class="form-control" id="cliente" name="cliente" required>
            </div>
            <div class="mb-3">
                <label for="total" class="form-label">Total</label>
                <input type="number" class="form-control" id="total" name="total" required>
            </div>
            <div class="mb-3">
                <label for="observaciones" class="form-label">Observaciones</label>
                <textarea class="form-control" id="observaciones" name="observaciones"></textarea>
            </div>
            <div class="mb-3">
                <label for="tipoOrdenIdTipo" class="form-label">Tipo de Orden</label>
                <input type="number" class="form-control" id="tipoOrdenIdTipo" name="tipoOrdenIdTipo" required>
            </div>
            <button type="submit" class="btn btn-primary">Registrar</button>
        </form>
    </div>
</body>
</html>

