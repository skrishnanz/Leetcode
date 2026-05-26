class Solution 
{
    public String oddString(String[] words) 
    {
        Map<Integer, List<String>> eq = new HashMap<>();
        
        for(String w: words)
        {
            List<Integer> diff = new ArrayList<>();
            for(int i=1; i < w.length(); i++)
            {
                diff.add(w.charAt(i) - w.charAt(i-1));
            }
            eq.computeIfAbsent(diff.hashCode(), x -> new ArrayList<>()).add(w);
        }
        for (Map.Entry<Integer, List<String>> e : eq.entrySet())
        {
            if(e.getValue().size() == 1) return e.getValue().get(0);
        }
        return words[0];
    }
}
