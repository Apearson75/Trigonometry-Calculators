class main
{
    public static void Main(string[] args)
    {
        Console.WriteLine("sin/cos/tan");
        string choice = Console.ReadLine();

        if (choice.Equals("sin"))
        {
            Console.WriteLine("Type a number you want to Sine");
            string sine = Console.ReadLine();
            Console.WriteLine(Math.Sin(Convert.ToDouble(sine)));
        } else if (choice.Equals("cos"))
        {
            Console.WriteLine("Type a number you want to Cosine");
            string cosine = Console.ReadLine();
            Console.WriteLine(Math.Cos(Convert.ToDouble(cosine)));
        } else if (choice.Equals("tan"))
        {
            Console.WriteLine("Type a number you want to Tangent");
            string tangent = Console.ReadLine();
            Console.WriteLine(Math.Tan(Convert.ToDouble(tangent)));
        }
    }
}

