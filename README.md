Task 1:

  Explanation of the SOLID principles Applied:
  
    1. SRP (Single Responsibility Principle): Each payment method (such as CreditCardPayment, PayPalPayment,
    and so on) has a single responsibility: to handle its respective payment.
    2. OCP (Open/Closed Principle): The PaymentService is closed for modification but open for extension, 
    which allows us to add additional payment methods (such as BankTransferPayment) without changing its
    implementation.
    3. LSP (Liskov Substitution Principle): Because the Payment interface is implemented by all 
    concrete classes (CreditCardPayment, PayPalPayment, etc.), they can be used interchangeably.
    4. ISP (Interface Segregation Principle): The Payment interface is straightforward and useful, 
    ensuring that each payment method class implements only the Payment method.
    5. DIP (Dependency Inversion Principle): The high-level PaymentService class is based on the Payment 
    interface rather than specific payment classes, ensuring flexibility and loose coupling.
