package com.senarratas.los25;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.senarratas.los25.data.Profiles;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    public static final String TAG = "ItemDetailFragment";
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy mName this fragment is presenting.
     */
    private Profiles.Profile mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = Profiles.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.party);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        // Show the dummy mName as text in a TextView.
        if (mItem != null) {
            String nameTemplate = "Nombre: %s";
            String emailLinkTemplate = "Email : <a href=\"maito:%s?subject=No-a-la-enmienda-de-la-constitución\">%s</a>";

            String formattedName = String.format(nameTemplate, mItem.mName);
            String formattedEmail = String.format(emailLinkTemplate, mItem.email, mItem.email);

            TextView nameTV = (TextView) rootView.findViewById(R.id.name);
            TextView emailTV = (TextView) rootView.findViewById(R.id.item_detail);

            nameTV.setText(formattedName);
            emailTV.setMovementMethod(LinkMovementMethod.getInstance());
            emailTV.setText(Html.fromHtml(formattedEmail));

            ((ImageView) rootView.findViewById(R.id.profile_hd)).setImageResource(Profiles.PROFILE_PICTURES_HD[Integer.valueOf(mItem.id)]);
        }

        return rootView;
    }
}
