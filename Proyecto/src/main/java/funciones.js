function verificar() {
    var capa = document.getElementById('contenedor');
    var usuario = document.getElementById('cedula').value;
    var passw = document.getElementById('pass').value;
    alert(usuario+" - "+passw);
    var ajax = new XMLHttpRequest();
    ajax.open("get", "/validar?user="+usuario+"&pass="+passw, true);
    ajax.send(null);
    ajax.onreadystatechange=function(){
        if (ajax.readyState == 3) {
            capa.innerHTML = "<div>Procesando...<div/>";
        } else if (ajax.readyState == 4) {
            capa.innerHTML = ajax.responseText;
        }
    };
}
