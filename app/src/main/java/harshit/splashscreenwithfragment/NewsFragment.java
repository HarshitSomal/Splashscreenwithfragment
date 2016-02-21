package harshit.splashscreenwithfragment;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

private ListView mListView;
    private List<String> mNewsList;
    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View fragmentview= inflater.inflate(R.layout.fragment_news, container, false);
        mListView=(ListView)fragmentview.findViewById(R.id.lists);
        mNewsList=new ArrayList<String>();
        mNewsList.add("My First Item on the list1");
        mNewsList.add("My First Item on the list2");
        mNewsList.add("My First Item on the list3");
        mNewsList.add("My First Item on the list4");
        mListView.setAdapter(new MyAdapter());
        return fragmentview;

    }
 public class MyAdapter extends BaseAdapter{


     @Override
     public int getCount() {
         return mNewsList.size();
     }

     @Override
     public Object getItem(int position) {
         return mNewsList.get(position);
     }

     @Override
     public long getItemId(int position) {
         return 0;
     }

     @Override
     public View getView(int position, View convertView, ViewGroup parent) {
         View rowView=getActivity().getLayoutInflater().inflate(R.layout.row,null);
         TextView textViewrow=(TextView)rowView.findViewById(R.id.textV);
         textViewrow.setText(mNewsList.get(position));
         return rowView;
     }
 }
}
