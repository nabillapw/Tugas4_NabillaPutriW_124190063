package com.example.tugas4;

import java.util.ArrayList;

public class FilmData {
    private static String[] nama = new String[]{
            "Harry Potter 1",
            "Harry Potter 2",
            "Harry Potter 3",
            "Harry Potter 4",
            "Harry Potter 5",
            "Harry Potter 6",
            "Harry Potter 7",
            "Harry Potter 8"};

    private static int[] gambar = new int[]{
            R.drawable.harpot1,
            R.drawable.harpot2,
            R.drawable.harpot3,
            R.drawable.harpot4,
            R.drawable.harpot5,
            R.drawable.harpot6,
            R.drawable.harpot7,
            R.drawable.harpot8};

    private static String[] filmdetails = new String[]{
            "Harry Potter and the Philosopher's Stone (released in the United States and India as Harry Potter and the Sorcerer's Stone) is a 2001 fantasy film directed by Chris Columbus and distributed by Warner Bros. Pictures, based on J. K. Rowling's 1997 novel of the same name.",
            "Harry Potter and the Chamber of Secrets is a 2002 fantasy film directed by Chris Columbus and distributed by Warner Bros. Pictures, based on J. K. Rowling's 1998 novel of the same name. ",
            "Harry Potter and the Prisoner of Azkaban is a 2004 fantasy film directed by Alfonso Cuarón and distributed by Warner Bros. Pictures, based on J. K. Rowling's 1999 novel of the same name.",
            "Harry Potter and the Goblet of Fire is a 2005 fantasy film directed by Mike Newell and distributed by Warner Bros. Pictures, based on J. K. Rowling's 2000 novel of the same name.",
            "Harry Potter and the Order of the Phoenix is a 2007 fantasy film directed by David Yates and distributed by Warner Bros. Pictures.[6] It is based on J. K. Rowling's 2003 novel of the same name. ",
            "Harry Potter and the Half-Blood Prince is a 2009 fantasy film directed by David Yates and distributed by Warner Bros. Pictures.",
            "Harry Potter and the Deathly Hallows – Part 1 is a 2010 fantasy film directed by David Yates and distributed by Warner Bros. Pictures.",
            "Harry Potter and the Deathly Hallows – Part 2 is a 2011 fantasy film directed by David Yates and distributed by Warner Bros. Pictures."};

    public static ArrayList<FilmModel> getListData(){
        FilmModel filmModel = null;
        ArrayList<FilmModel> list = new ArrayList<FilmModel>();
        for ( int i = 0; i < nama.length; i++){
            filmModel = new FilmModel();
            filmModel.setGambarFilm(gambar[i]);
            filmModel.setJudulFilm(nama[i]);
            filmModel.setDetailFilm(filmdetails[i]);
            list.add(filmModel);
        }
        return list;
    }
}
