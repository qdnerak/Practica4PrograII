public class Main {
    public  static void main(String[]args){
        Paciente lucas= new Paciente("Lucas","Rivera","Gomez","856412","178954","186523");
        System.out.println("=================================================================");
        System.out.println("* * * * * H O S P I T A L  N U E V A  E S P E R A N Z A * * * * *");
        System.out.println("=================================================================");
        Hospital esperanza=new Hospital("15A5","Nueva Esperanza","Cochabamba",44589652,"Av. San Martin");
        System.out.println("* * * * * H O S P I T A L * * * * *");
        System.out.println("Codigo Hospital:"+esperanza.getCodHospital());
        System.out.println("Nombre:"+esperanza.getNombre());
        System.out.println("Ciudad:"+esperanza.getCiudad());
        System.out.println("Telefono:"+esperanza.getTelefono());
        System.out.println("Direccion:"+esperanza.getDireccion());
        System.out.println("* * * * * P A C I E N T E * * * * *");
        System.out.println("Nombre:"+lucas.getNombre());
        System.out.println("Primer Apellido:"+lucas.getPrimerApellido());
        System.out.println("Segundo Apellido:"+lucas.getSegundoApellido());
        System.out.println("D.N.I.:"+lucas.getDni());
        Medico lorena=new Medico("Lorena","Valdes","Herbas","5641253","456123","Internado");
        System.out.println("* * * * * M E D I C O * * * * *");
        System.out.println("Nombre:"+lorena.getNombre());
        System.out.println("Primer Apellido:"+lorena.getPrimerApellido());
        System.out.println("Segundo Apellido:"+lorena.getSegundoApellido());
        System.out.println("D.N.I.:"+lorena.getDni());
        Servicio revision=new Servicio("12","Revision General",2);
        System.out.println("* * * * * S E R V I C I O * * * * *");
        System.out.println("Numero:"+ revision.getServicio());
        System.out.println("Nombre:"+revision.getNombre());
        System.out.println("Numero de cama:"+ revision.getNumeroCamas());
        Historial nuevo=new Historial("Revision General","Lucas Rivera Gomez",2);
        System.out.println("* * * * * H I S T O R I A L * * * * *");
        System.out.println("Servicio:"+nuevo.getServicio());
        System.out.println("Nombre:"+nuevo.getNombre());
        System.out.println("Comentario: Ninguno");
        Visita otro=new Visita("Revision General","Maria Lopez",2);
        System.out.println("* * * * * V I S I T A * * * * *");
        System.out.println("Visita:1");
        System.out.println("Nombre:"+otro.getNombre());
        System.out.println("Numero cama visitada:"+otro.numeroCamas);
    }
}
