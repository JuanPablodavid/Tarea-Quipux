public class PaisesAmerica {
    public static void main(String[] args) {
        String[][] paisesAmerica = {
           
            {"Canadá", "Estados Unidos", "México","Belice", "Costa Rica", "El Salvador", "Guatemala", "Honduras", "Nicaragua", "Panamá",
               "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Perú","Surinam", 
               "Uruguay","Venezuela", "Antigua y Barbuda", "Bahamas", "Barbados", "Cuba", "Dominica", "Granada", 
              "Haití", "Jamaica", "República Dominicana", "San Cristóbal y Nieves", "Santa Lucía",
             "San Vicente y las Granadinas", "Trinidad y Tobago"
                
            }     
        };

        System.out.println("Países de América con 4 letras:");
        
        for (String[] region : paisesAmerica) {
            for (String pais : region) {
                if (pais.length() == 4) {
                    System.out.println(" - " + pais);
                }
            }
        }
    }
}
