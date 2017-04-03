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

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createProfile(i));
        }
    }

    private static void addItem(Profile item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.party, item);
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
        return new Profile(party,
                PROFILE_PICTURES[position],
                NAMES[position],
                makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of mName.
     */
    public static class Profile {
        public final int mProfilePicture;
        public final String mName;
        public final String party;
        public final String details;

        public Profile(String party, int profilePic, String name, String details) {
            this.mProfilePicture = profilePic;
            this.party = party;
            this.mName = name;
            this.details = details;
        }

        @Override
        public String toString() {
            return mName;
        }
    }
}
