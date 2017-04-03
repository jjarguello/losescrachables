package com.senarratas.los25.data;

import com.senarratas.los25.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample mName for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class Profiles {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Profile> ITEMS = new ArrayList<Profile>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Profile> ITEM_MAP = new HashMap<String, Profile>();

    private static final int COUNT = 24;

    private static int[] PROFILE_PICTURES = {
            // PLRA
            R.drawable.fernando_silva,
            R.drawable.ramon_verlangieri,
            R.drawable.blanca_lila,
            R.drawable.enzo_cardozo,
            R.drawable.julio_cesar_ramon_franco,
            R.drawable.blas_llano,
            R.drawable.blanca_fonseca,
            R.drawable.zulma_ramona_gomez,

            // ANR
            R.drawable.derlis_osorio,
            R.drawable.julio_antonio_quinonez,
            R.drawable.lilian_samaniego,
            R.drawable.julio_cesar_velazquez,
            R.drawable.victor_bogado,
            R.drawable.juan_dario_monges,
            R.drawable.nelson_dario_aguinagalde,
            R.drawable.oscar_alberto_gonzalez_daher,
            R.drawable.mirta_guisinsky,
            R.drawable.gustavo_javier_alfonso_gonzalez,
            R.drawable.carlos_nunes_aguero,

            // UNACE
            R.drawable.jorge_antonio_oviedo_matto,
            R.drawable.jose_manuel_bobeda_melgarejo,

            // FG
            R.drawable.oscar_hugo_richer_florentin,
            R.drawable.sixto_pereira,
            R.drawable.esperanza_martinez_de_portillo,
            R.drawable.carlos_alberto_filizzola,
    };

    public static int[] PROFILE_PICTURES_HD = {
            // PLRA
            R.drawable.fernando_silva_hd,
            R.drawable.ramon_verlangieri_hd,
            R.drawable.blanca_lila_hd,
            R.drawable.enzo_cardozo_hd,
            R.drawable.julio_cesar_ramon_franco_hd,
            R.drawable.blas_llano_hd,
            R.drawable.blanca_fonseca_hd,
            R.drawable.zulma_ramona_gomez_hd,

            // ANR
            R.drawable.derlis_osorio_hd,
            R.drawable.julio_antonio_quinonez_hd,
            R.drawable.lilian_samaniego_hd,
            R.drawable.julio_cesar_velazquez_hd,
            R.drawable.victor_bogado_hd,
            R.drawable.juan_dario_monges_hd,
            R.drawable.nelson_dario_aguinagalde_hd,
            R.drawable.oscar_alberto_gonzalez_daher_hd,
            R.drawable.mirta_guisinsky_hd,
            R.drawable.gustavo_javier_alfonso_gonzalez_hd,
            R.drawable.carlos_nunes_aguero_hd,

            // UNACE
            R.drawable.jorge_antonio_oviedo_matto_hd,
            R.drawable.jose_manuel_bobeda_melgarejo_hd,

            // FG
            R.drawable.oscar_hugo_richer_florentin_hd,
            R.drawable.sixto_pereira_hd,
            R.drawable.esperanza_martinez_de_portillo_hd,
            R.drawable.carlos_alberto_filizzola_hd,
    };

    private static String[] NAMES = {
            "Fernando Alberto Silva Facetti",
            "Ramón Gómez Verlangieri",
            "María Blanca Lila Mignarro de González",
            "Enzo Cardozo Jiménez",
            "Julio César Ramón Franco Gómez",
            "Blas Antonio Llano Ramos",
            "Blanca Beatríz Fonseca Legal",
            "Zulma Ramona Gómez Cáceres",
            "Derlis Ariel Alejandro Osorio Nunes",
            "Julio Antonio Quiñónez Daiub",
            "Lilian Graciela Samaniego González",
            "Julio César Velázquez Tillería",
            "Víctor Alcides Bogado González",
            "Juan Darío Monges Espínola",
            "Nelson Darío Aguinagalde Gallinar",
            "Oscar Alberto González Daher",
            "Mirta Leonor Gusinky",
            "Gustavo Javier Alfonso González",
            "Carlos Núñez Agüero",
            "Jorge Antonio Oviedo Matto",
            "José Manuel Bóbeda Melgarejo",
            "Oscar Hugo Richer Florentín",
            "Sixto Pereira Galeano",
            "Esperanza Martínez de Portillo",
            "Carlos Alberto Filizzola Pallarés"
    };

    private static String[] EMAILS = {
            "fsilva@senado.gov.py",
            "rgverlangieri@senado.gov.py",
            "blmignarro@senado.gov.py",
            "ecardozo@senado.gov.py",
            "jcfranco@senado.gov.py",
            "bllano@senado.gov.py",
            "bfonseca@senado.gov.py",
            "zrgomez@senado.gov.py",
            "dosorio@senado.gov.py",
            "jquinonez@senado.gov.py",
            "lsamaniego@senado.gov.py",
            "jcvelazquez@senado.gov.py",
            "vbogado@senado.gov.py",
            "jmonges@senado.gov.py",
            "naguinagalde@senado.gov.py",
            "gdaher@senado.gov.py",
            "mgusinky@senado.gov.py",
            "galfonso@senado.gov.py",
            "cnunez@senado.gov.py",
            "joviedo@senado.gov.py",
            "jbobeda@senado.gov.py",
            "oricher@senado.gov.py",
            "spereira@senado.gov.py",
            "emartinezl@senado.gov.py",
            "cfilizzola@senado.gov.py"
    };

    private static String[] PHONES = {
            "4145137",
            "4145134",
            "4145135",
            "4145147",
            "4145120",
            "4145108",
            "4145156",
            "4145115",
            "4145284",
            "4145287",
            "4145279",
            "4145286",
            "4145214",
            "4145285",
            "4145249",
            "4145215",
            "4145220",
            "4145238",
            "4145283",
            "4145205",
            "4145206",
            "4145034",
            "4145030",
            "4145213",
            "4145210"
    };

    static {
        // Add some sample items.
        for (int i = 0; i <= COUNT; i++) {
            addItem(createProfile(i));
        }
    }

    private static void addItem(Profile item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Profile createProfile(int position) {
        String party = "";
        if(position < 8){
            party = "PRLA";
        }else if(position < 19){
            party = "ANR";
        }else if(position < 22){
            party = "UNACE";
        }else {
            party = "Frente Guasú";
        }
        return new Profile(
                String.format("%d", position),
                party,
                PROFILE_PICTURES[position],
                NAMES[position],
                EMAILS[position],
                PHONES[position]);
    }

    /**
     * A user profile
     */
    public static class Profile {
        public final String id;
        public final int mProfilePicture;
        public final String mName;
        public final String party;
        public final String email;
        public final String phoneNumber;

        public Profile(String id, String party, int profilePic, String name, String email, String phoneNumber) {
            this.id = id;
            this.mProfilePicture = profilePic;
            this.party = party;
            this.mName = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return mName;
        }
    }
}
