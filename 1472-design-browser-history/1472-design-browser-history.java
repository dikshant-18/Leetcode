class BrowserHistory {
    public List<String> hist;
    public int cr;

    public BrowserHistory(String homepage) {
        hist = new ArrayList<>();
        hist.add(homepage);
        cr = 0;
    }
    
    public void visit(String url) {
        while(hist.size() > cr + 1) {
            hist.remove(hist.size() - 1);
        }
        hist.add(url);
        cr++;
    }
    
    public String back(int steps) {
        cr = Math.max(0, cr - steps);
        return hist.get(cr);
    }
    
    public String forward(int steps) {
        cr = Math.min(hist.size() - 1, cr + steps);
        return hist.get(cr);
    }
}