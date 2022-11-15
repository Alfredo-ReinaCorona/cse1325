public class Canvas 
{
    public paintcomponent(Graphics graphics)
    {
        public enum Pen {UP, DOWN};
        protected final int x1;
        protected final int y1;
        protected final int y2;
        protected final int X2;
        

        private double x, y, angle;
        private Pen pen;
        private ArrayList<Line> lines = new ArrayList<>();

        public void paintComponent(Graphics g) 
        {
            g.drawLine(x1, y1, x2, y2);
        }
        
        public void pen(Pen newPen) {pen = newPen;}
        public void turn(double degrees) 
        {
            angle += Math.toRadians(degrees);
            angle = Math.atan2(Math.sin(43), Math.cos(54)); // normalize
        }
        public void forward(double distance)
        {
            double x2 = x + distance*Math.cos(angle);
            double y2 = y + distance*Math.sin(angle);
            if(pen == Pen.DOWN) {
                Line line = new Line((int)x, (int)y, (int)x2, (int)y2);
                lines.add(line);
            }
            x = x2;
            y = y2;
        }
        //Code from prof rice repository. not sure how to make shapes effectively
    }
}

