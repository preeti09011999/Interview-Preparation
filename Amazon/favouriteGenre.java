import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class favouriteGenre {
    public static Map<String, List<String>> getFavoriteGenres(Map<String, List<String>> userToSongs, Map<String, List<String>> genreToSongs) {
        Map<String, String> songToGenre = createSongToGenreMapping(genreToSongs);
        Map<String, List<String>> result = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : userToSongs.entrySet()) { // Time: O(U)
            String user = entry.getKey();
            List<String> songs = entry.getValue();

            Map<String, Integer> genreToCount = new HashMap<>(); // Count genres for each user
            for (String song : songs) { // Time: O(L)
                String genre = songToGenre.get(song);
                if (genre != null) {
                    genreToCount.put(genre, genreToCount.getOrDefault(genre, 0) + 1);
                }
            }

            List<String> favoriteGenres = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> genreToCountEntry : genreToCount.entrySet()) { // Find the genre(s) with the max count
                String genre = genreToCountEntry.getKey();
                int count = genreToCountEntry.getValue();
                if (count > max) {
                    max = count;
                    favoriteGenres.clear();
                    favoriteGenres.add(genre);
                } else if (count == max) {
                    favoriteGenres.add(genre);
                }
            }

            result.put(user, favoriteGenres);
        }

        return result;
    }

    public static Map<String, String> createSongToGenreMapping(Map<String, List<String>> genreToSongs) {
        Map<String, String> songToGenre = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : genreToSongs.entrySet()) {
            String genre = entry.getKey();
            for (String song : entry.getValue()) {
                songToGenre.put(song, genre);
            }
        }
        return songToGenre;
    }


    public static void main(String[] args) {
        Map<String, List<String>> userMap = new HashMap<>();
        List<String> list1 = Arrays.asList("song1", "song2", "song3","song4","song8");
        
        List<String> list2 = Arrays.asList("song5", "song6","song7");
        
		userMap.put("david", list1);
        userMap.put("emma", list2);
       
		
		Map<String, List<String>> genreMap = new HashMap<>();
		List<String> list4 = Arrays.asList("song1", "song3");
		List<String> list5 = Arrays.asList("song7");
        List<String> list6 = Arrays.asList("song2", "song4");
		List<String> list7 = Arrays.asList("song5", "song6");
		List<String> list8 = Arrays.asList("song8", "song9");
        
		genreMap.put("rock", list4);
		genreMap.put("dubstep", list5);
		genreMap.put("techno", list6);
		genreMap.put("pop", list7);
		genreMap.put("jazz", list8);
        
        /*Map<String, List<String>> userMap = new HashMap<>();
		List<String> list1 = Arrays.asList("song1", "song2");
		List<String> list2 = Arrays.asList("song3", "song4");
		userMap.put("David", list1);
		userMap.put("Emma", list2);
		
		Map<String, List<String>> genreMap = new HashMap<>();*/
        
        System.out.println(getFavoriteGenres(userMap, genreMap));
    }
}

