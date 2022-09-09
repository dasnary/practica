public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[6];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Vaca", "Mamifero");
        miVertebrados[2] = new Vertebrado("Tiburón", "Pez");
        miVertebrados[3] = new Vertebrado("Burro", "Mamimero");
        miVertebrados[4] = new Vertebrado("Ballena", "Pez");
        
        return miVertebrados;
    }
}
