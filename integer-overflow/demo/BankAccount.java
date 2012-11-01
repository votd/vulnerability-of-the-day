// Copyright 2012 Andrew Meneely. 
// Licensed under the Educational Community License, Version 2.0 (the "License"); 
// you may not use this file except in compliance with the License. 
// You may obtain a copy of the License at http://www.osedu.org/licenses/ECL-2.0. 
// Unless required by applicable law or agreed to in writing, 
// software distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
// See the License for the specific language governing permissions 
// and limitations under the License.

public class BankAccount {
	private int balance = 0;

	public void deposit(int amount) {
		balance += amount;
	}

	public static void main(String[] args) {
		System.out.println("Bank account initialized");
		BankAccount bank = new BankAccount();

		System.out.println("Depositing a very large amount...");
		bank.deposit(Integer.MAX_VALUE);
		System.out.println("Balance: " + bank.balance);

		System.out.println("One more...");
		bank.deposit(1);
		System.out.println("Balance: " + bank.balance);
	}
}
