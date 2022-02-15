class GfG
{
	public int remAnagrams(String s,String s1)
    {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a'] += 1;
        }
        
        for (int i = 0; i < s1.length(); i++) {
            arr2[s1.charAt(i) - 'a'] += 1;
        }
       
        // System.out.println("arr1 " + Arrays.toString(arr1));
        // System.out.println("arr2 " + Arrays.toString(arr2));
        
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr1[i] == arr2[i]) continue;
            else {
                if (arr1[i] == 0 && arr2[i] != 0) {
                    count += arr2[i];
                    arr2[i] = 0;
                } else if (arr1[i] != 0 && arr2[i] == 0) {
                    count += arr1[i];
                    arr1[i] = 0;
                } else {
                    count += Math.abs(arr1[i] - arr2[i]);
                }
            }
        }
        return count;
    }
}