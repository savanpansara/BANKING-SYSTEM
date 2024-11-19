import java.util.*;  
class BankDetails
{	
    String Name,E_mail,Mobile_No,Pin_No,Bank,acc_type,IFSC,Branch_Name,Branch_Address;
    long Number,amount,AccountNo,balance=0;
    int pin;	
	double prevTrans;
	
    Scanner sc = new Scanner(System.in);  
	
    void openAccount(long Accountno) 
	{   
		System.out.println("\n**********************\n*        BANK        *\n**********************\n");
		int SB;
		do
		{
			System.out.println("1] SBI\n2] BOB\n3] HDFC\n4] ICICI\n5] BOI\n");
			System.out.println("SELECT BANK :");
			SB = sc.nextInt();
			switch (SB)
			{
				case 1:
				{
					Bank="STATE BANK OF INDIA (SBI)";
					System.out.print("\n************************************\n*  WELCOME TO STATE BANK OF INDIA  *\n************************************\n\n");
					System.out.println("1] C.G.ROAD BRANCH\n2] BOPAL BRANCH\n3] GURUKUL ROAD BRANCH\n4] SATELLITE ROAD BRANCH\n5] NIKOL CHAR RASTA BRANCH\n");
					System.out.println("SELECT BRANCH :");
					int SB1 = sc.nextInt();
					switch(SB1)
					{
						case 1:
						{
							Branch_Name="C.G.ROAD BRANCH";
							Branch_Address="SHYAM GOKUL A BY 24,NAVRANGPURA ROAD,AHMEDABAD 380009";
							IFSC="SBIN0060399";
							break;
						}
						case 2:
						{
							Branch_Name="BOPAL BRANCH";
							Branch_Address="HARI DARSHAN COMPLEX,GHUMA GAM ROAD,AHMEDABAD 380058";
							IFSC="SBIN0040960";
							break;
						}
						case 3:
						{
							Branch_Name="GURUKUL ROAD BRANCH";
							Branch_Address="SHIVAM COMPLEX,GURUKUL ROAD,AHMEDABAD 380052";
							IFSC="SBIN0060400";
							break;
						}
						case 4:
						{
							Branch_Name="SATELLITE ROAD BRANCH";
							Branch_Address="ARJUN TOWER,SATELLITE ROAD,AHMEDABAD 380001";
							IFSC="SBIN0031819";
							break;
						}
						case 5:
						{
							Branch_Name="NIKOL CHAR RASTA BRANCH";
							Branch_Address="ARCADESHUKAN BUNGALOW,NARODA ROAD,NIKOL,AHMEDABAD 382350";
							IFSC="SBIN0017900";
							break;
						}
					}
					break;
				}
				case 2:
				{
					Bank="BANK OF BARODA (BOB)";
					System.out.print("\n*************************************\n*     Welcome To Bank Of Baroda     *\n*************************************\n\n");
					System.out.println("1] GURUKUL BRANCH\n2] SATELLITE ROAD BRANCH\n3] NAVRANGPURA BRANCH\n4] GITA MANDIR BRANCH\n5] ISKON CIRCLE BRANCH\n");
					System.out.println("SELECT BRANCH :");
					int SB2 = sc.nextInt();
					switch(SB2)
					{
						case 1:
						{
							Branch_Name="GURUKUL BRANCH";
							Branch_Address="SURYA COMPLEX,GURUKUL ROAD,MEMNAGAR,AHMEDABAD 380052";
							IFSC="BARB0GURAHM";
							break;
						}
						case 2:
						{
							Branch_Name="SATELLITE ROAD BRANCH";
							Branch_Address="GROUND FLOOR,JYOTI COMPLEX,SHYAMAL CROSS ROADS,SATELLITE 380015";
							IFSC="BARB0SATAHM";
							break;
						}
						case 3:
						{
							Branch_Name="NAVRANGPURA BRANCH";
							Branch_Address="OPP.CUSTOM HOUSE NAVRANGPURA NEAR INCOME TAX CHAR RASTA,AHMEDABAD 380009";
							IFSC="BARB0NAVRAN";
							break;
						}
						case 4:
						{
							Branch_Name="GITA MANDIR BRANCH";
							Branch_Address="BHULABHAI PARK CROSS ROAD,GITAMANDIR ROAD,AHMEDABAD 380022";
							IFSC="BARB0GITAMA";
							break;
						}
						case 5:
						{
							Branch_Name="ISKON CIRCLE BRANCH";
							Branch_Address="OPP.RAJPATH CLUB,NEAR GORDHAN THAL RESTAURANT,AHMEDABAD 380015";
							IFSC="BARB0ISCAHM";
							break;
						}
					}
					break;
				}
				case 3:
				{
					Bank="HDFC BANK";
					System.out.print("\n************************************\n*       WELCOME TO HDFC BANK       *\n************************************\n\n");
					System.out.println("1] JODHPUR CROSS ROAD BRANCH\n2] MEMNAGAR BRANCH\n3] PRAHLAD NAGAR BRANCH\n4] SATADHAR CIRCLE BRANCH\n5] NAVRANGPURA BRANCH\n");
					System.out.println("SELECT BRANCH :");
					int SB3 = sc.nextInt();
					switch(SB3)
					{
						case 1:
						{
							Branch_Name="JODHPUR CROSS ROAD BRANCH";
							Branch_Address="ISKON PARK,OPP.STAR BAZAAR,JODHPUR CROSS ROAD,AHMEDABAD 380015";
							IFSC="HDFC0001285";
							break;
						}
						case 2:
						{
							Branch_Name="MEMNAGAR BRANCH";
							Branch_Address="SHILP CORNER,SUBASH CHOWK,MEMNAGAR,AHMEDABAD 380052";
							IFSC="HDFC0001675";
							break;
						}
						case 3:
						{
							Branch_Name="PRAHLAD NAGAR BRANCH";
							Branch_Address="SHIVALIK ARCADE,ANAND NAGAR ROAD,PRAHLAD NAGAR,AHMEDABAD 380015";
							IFSC="HDFC0000890";
							break;
						}
						case 4:
						{
							Branch_Name="SATADHAR CIRCLE BRANCH";
							Branch_Address="SHANTI MALL,SATADHAR CIRCLE,OPP.NAVARANG TOWER,AHMEDABAD 380061";
							IFSC="HDFC0001288";
							break;
						}
						case 5:
						{
							Branch_Name="NAVRANGPURA BRANCH";
							Branch_Address="ASTRAL TOWER,NEAR MITHAKALI SIX ROADS,NAVRANGPURA,AHMEDABAD 380009";
							IFSC="HDFC0000006";
							break;
						}
					}
					break;
				}
				case 4:
				{
					Bank="ICICI BANK";
					System.out.print("\n*************************************\n*       WELCOME TO ICICI BANK       *\n*************************************\n\n");
					System.out.println("1] BAPUNAGAR BRANCH\n2] S.G.ROAD BRANCH\n3] SATELLITE AREA BRANCH\n4] VASNA BRANCH\n5] NARANPURA BRANCH\n");
					System.out.println("SELECT BRANCH :");
					int SB4 = sc.nextInt();
					switch(SB4)
					{
						case 1:
						{
							Branch_Name="BAPUNAGAR BRANCH";
							Branch_Address="SARDAR PATEL MALL,DIAMOND MILL ROAD,BAPUNAGAR,AHMEDABAD 382345";
							IFSC="ICIC0000930";
							break;
						}
						case 2:
						{
							Branch_Name="S.G.ROAD BRANCH";
							Branch_Address="S.G.ROAD,BODAKDEV,AHMEDABAD 380054";
							IFSC="ICIC0000295";
							break;
						}
						case 3:
						{
							Branch_Name="SATELLITE AREA BRANCH";
							Branch_Address="TIRTHJAL COMPLEX,JODHPUR GAM(SATELLITE AREA),AHMEDABAD 380015";
							IFSC="ICIC0000067";
							break;
						}
						case 4:
						{
							Branch_Name="VASNA BRANCH";
							Branch_Address="HAASH BUSINESS CENTER,FATEHPURA,VASNA,AHMEDABAD 380007";
							IFSC="ICIC0000344";
							break;
						}
						case 5:
						{
							Branch_Name="NARANPURA BRANCH";
							Branch_Address="STHAPNA COMPLEX,OPP.GHB COMPLEX,ANKUR ROAD,NARANPURA,AHMEDABAD 380013";
							IFSC="ICIC0000345";
							break;
						}
					}
					break;
				}
				case 5:
				{
					Bank="BANK OF INDIA (BOI)";
					System.out.print("\n************************************\n*     WELCOME TO BANK OF INDIA     *\n************************************\n\n");
					System.out.println("1] GURUKUL ROAD BRANCH\n2] MANINAGAR BRANCH\n3] CTM CROSS ROAD BRANCH\n4] NARODA BRANCH\n5] THALTEJ BRANCH\n");
					System.out.println("SELECT BRANCH :");
					int SB5 = sc.nextInt();
					switch(SB5)
					{
						case 1:
						{
							Branch_Name="GURUKUL ROAD BRANCH";
							Branch_Address="HARVI COMPLEX ABOVE,SUBHASH CHOWK GURUKUL ROAD,AHMEDABAD 380052";
							IFSC="BKID0002048";
							break;
						}
						case 2:
						{
							Branch_Name="MANINAGAR BRANCH";
							Branch_Address="BANK OF INDIA,MANINAGAR,AHMEDABAD 3800";
							IFSC="BKID0002008";
							break;
						}
						case 3:
						{
							Branch_Name="CTM CROSS ROAD BRANCH";
							Branch_Address="RAJSHREE COMPLEX,CTM CHAR RASTA,AHMEDABAD ";
							IFSC="BKID0002016";
							break;
						}
						case 4:
						{
							Branch_Name="NARODA BRANCH";
							Branch_Address="OPP.NARODA POLICE STATION,NARODA,AHMEDABAD ";
							IFSC="BKID0002101";
							break;
						}
						case 5:
						{
							Branch_Name="THALTEJ BRANCH";
							Branch_Address="SAHAJANAND COMPLEX,OPP.BHAI KAKA NAGAR BUS STAND,AHMEDABAD ";
							IFSC="BKID0002111";
							break;
						}
					}
					break;
				}
			}
		}
		while(false);
        System.out.println("\nFULL NAME :");
		sc.nextLine();
        Name = sc.nextLine(); 
		
		System.out.println("\nACCOUNT TYPE : ");
		int AT; 
        do
		{
			System.out.println("1] SAVINGS\n2] CURRENT \n");
			System.out.println("Enter Your Choice");
			AT = sc.nextInt();
			switch (AT)
			{
				case 1:
				{
					acc_type="SAVING";
					break;
				}
				case 2:
				{
					acc_type="CURRENT";
					break;
				}
			}
			
		}
		while(false);
		AccountNo=Accountno;
		System.out.println("\nYOUR E-MAIL :");
		sc.nextLine();
        E_mail = sc.nextLine();
		System.out.println("\nMOBILE NUMBER :");
		Number = sc.nextLong();
		Mobile_No=Number+"";
		int N_Count=0;
		while(N_Count==0)
		{
			Mobile_No=Number+"";
			if(Mobile_No.length()!=10)
			{
				System.out.println("PLESE ENTER 10 DIGIT MOBILE NUMBER : ");
				Number=sc.nextLong();
			}
			else
			{
				N_Count=1;
			}				
		}
        System.out.println("\nSET PIN : (4 DIGIT)");  
        pin = sc.nextInt();
		Pin_No=pin+"";
		int P_Count=0;
		while(P_Count==0)
		{
			Pin_No=pin+"";
			if(Pin_No.length()!=4)
			{
				System.out.println("PLESE ENTER 4 DIGIT PIN : ");
				pin=sc.nextInt();
			}
			else
			{
				P_Count=1;
			}				
		}
		System.out.println("         BANK                : " + Bank+"\n         BRANCH NAME         : " + Branch_Name+"\n         BRANCH ADDRESS      : " + Branch_Address+"\n         IFSC                : " + IFSC+"\n         ACCOUNT HOLDER NAME : " + Name.toUpperCase()+"\n         ACCOUNT NUMBER      : " + AccountNo+"\n         E-MAIL              : " + E_mail.toLowerCase()+"@gmail.com"+"\n         MOBILE NUMBER       : " + Number+"\n         ACCOUNT TYPE        : " + acc_type+"\n\n");
	}
	
    void showAccount()
	{  
		System.out.println("\n\n  $$$-----------------------------------------------------------------------$$$\n");
        System.out.println("         BANK                : " + Bank              					+"\n" );
		System.out.println("         BRANCH NAME         : " + Branch_Name       					+"\n" );
		System.out.println("         BRANCH ADDRESS      : " + Branch_Address   					+"\n" );
		System.out.println("         IFSC                : " + IFSC              					+"\n" );
		System.out.println("         ACCOUNT HOLDER NAME : " + Name.toUpperCase()					+"\n" );  
        System.out.println("         ACCOUNT NUMBER      : " + AccountNo         					+"\n" );
        System.out.println("         E-MAIL              : " + E_mail.toLowerCase()+"@gmail.com"	+"\n" );		
		System.out.println("         MOBILE NUMBER       : " + Number            					+"\n" );
        System.out.println("         ACCOUNT TYPE        : " + acc_type          					+"\n" );  
        System.out.println("         BALANCE             : " + balance           					+"\n" );  
		System.out.println("  $$$-----------------------------------------------------------------------$$$\n\n");
	}
	
	void Balance()
	{
		System.out.println("\n\n  $$$--------------------------------$$$\n            BALANCE :"+balance+"\n  $$$--------------------------------$$$\n\n");
	}
 
    void deposit()
	{   
        System.out.print("ENTER AMOUNT TO DEPOSIT :");  
        amount = sc.nextLong();  
        balance = balance + amount;
		prevTrans=amount;
		System.out.println("\n\n  $$$--------------------------------$$$\n            BALANCE :"+balance+"\n  $$$--------------------------------$$$\n\n");
	}	
	
    void withdrawal()
	{    
        System.out.println("ENTER AMOUNT TO WITHDRAW :");  
        amount = sc.nextLong();
        if (balance >= amount)
		{  
			balance = balance - amount;  
			prevTrans=-amount;
			System.out.println("\n\n  $$$--------------------------------$$$\n            BALANCE :"+balance+"\n  $$$--------------------------------$$$\n\n");
		}
		else
		{  
            System.out.println("\n YOUR BALANCE IS LESS THEN  " + amount + "\tTRANSACTION FAILED...!! \n" );  
        }  
    }  
	
	void PreviousTrans()
	{
        if(prevTrans>0)
		{	
            System.out.println("\n\n  $$$--------------------------------$$$\n      DEPOSIT : "+prevTrans+"\n  $$$--------------------------------$$$\n\n");
		}
        else if(prevTrans<0)
		{
            System.out.println("\n\n  $$$--------------------------------$$$\n      WITHDRAW : "+Math.abs(prevTrans)+"\n  $$$--------------------------------$$$\n\n");
		}
        else
		{
            System.out.println("\n\n  $$$----------------------------$$$\n       NO TRANSACTION OCCURED\n  $$$----------------------------$$$\n\n");
        }
    }
	
	void Change_PIN()
	{
		System.out.println("\n============= CHANGE PIN =============\n");
		boolean C_P_found = false;
		while(C_P_found == false)
		{
			System.out.println("ENTER NEW PIN : (4 DIGIT)");
			int PIN1 = sc.nextInt();
			System.out.println("CONFORM NEW PIN :");
			int PIN2 = sc.nextInt();
			if(PIN1 == PIN2 && PIN1 >= 1000 && PIN1 <= 9999)
			{
				pin = PIN1;
				C_P_found = true;
				System.out.println("\n\n-------------------------------$$$\n  PIN SUCESSFULLY CHANGE...\n-------------------------------$$$\n\n");
				break;
			}
			else
			{
				System.out.println("\n\n-------------------------------------------!!!\nINVALID COMBINATION , ENTER VALID PIN\n-------------------------------------------!!!\n\n");
				C_P_found = false;
			}
		}
	}
	
	void transfer(BankDetails recipient,long amount) 
	{
        if (amount>balance) 
		{
            System.out.println("\n YOUR BALANCE IS LESS THEN  " + amount + " TRANSACTION FAILED...!! \n" );
        } 
		else 
		{
            balance=balance-amount;
            recipient.balance += amount;
            System.out.println("\n"+amount+" TRANSFERRED SUCESSFULLY TO "+recipient.Name+". NEW BALANCE : "+balance);
        }
    }
	
	boolean searchN(long NUMBER)
	{
		if (Number==NUMBER)
		{    
            return (true);			
        }
        else
		{			
			return (false);		
		}
	}
	
    boolean searchA(long ac_no)
	{  
        if (AccountNo==ac_no)
		{    
            return (true);
        }
		else
		{
			return (false);
		}
    }
	
    boolean searchP(int Pin)
	{  
        if (pin==Pin)
		{    
            return (true);
		}
        else
		{			
			return (false);		
		}
	}  
}  

class BankingApp 
{
    public static void main(String arg[])
	{  
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n**********************************************************\n*         WELCOME BANK ACCOUNT MANAGEMENT SYSTEM         *\n**********************************************************\n\n");
        System.out.println("How many number of customers do you want to open Account ? :");
        int A = sc.nextInt();
		
        BankDetails C[] = new BankDetails[A];  
        
		for (int i = 0; i < C.length; i++)
		{  
            C[i] = new BankDetails();
			long Accountno=1234567890;
			Accountno=Accountno+i;
            C[i].openAccount(Accountno);
        }
        int ch;	
        do
		{
            System.out.println("\n****************************\n* PLESE SELECT YOUR CHOISE *\n****************************");
            System.out.println("\n1] SHOW ALL ACCOUNT DETAILS\n2] SEE YOUR ACCOUNT DETAILS\n3] DEPOSIT AMOUNT\n4] WITHDRAW AMOUNT\n5] CHECK BALANCE\n6] CHANGE PIN\n7] PREVIOUS TRANSACTION\n8] TRANSFER AMOUNT\n9] EXIT\n");  
			System.out.println("*********************\n* ENTER YOUR CHOISE *\n*********************");		
            ch = sc.nextInt();    
			
			switch (ch)
			{
                case 1:  
				{
					for(int i = 0; i < C.length; i++)
					{
						C[i].showAccount();
					}
					break;
				}
				
                case 2:
				{	
					int AM;
					System.out.println("\n1] ACCOUNT NUMBER\n2] MOBILE NUMBER\n");
					AM = sc.nextInt();
					switch(AM)
					{
						case 1:
						{
							System.out.print("\nENTER ACCOUNT NUMBER :");
							sc.nextLine();
							long ac_no = sc.nextLong();
							System.out.print("ENTER PIN : ");  
							int Pin = sc.nextInt();  
							boolean found1 = false;
							boolean found2 = false;
							for (int i = 0; i < C.length; i++)
							{  
								found1 = C[i].searchA(ac_no);
								found2 = C[i].searchP(Pin);  
								if (found1 && found2 )
								{  
									C[i].showAccount();
									break;  
								}  
							}  
							if (!found1)
							{  
								System.out.println("\n\n--------------------------------------------!!!\n SEARCH FAILED..!!  ACCOUNT DOESEN'T EXIST..!!\n--------------------------------------------!!!\n\n");
							}
							else if(!found2)
							{
								System.out.println("\n\n-------------------!!!\nINVALID PIN..!!\n-------------------!!!\n\n");
							}  
							break;
						}
		
						case 2:
						{
							System.out.print("\nENTER MOBILE NUMBER :");
							long NUMBER = sc.nextLong();
							System.out.print("ENTER PIN : ");  
							int Pin = sc.nextInt();  
							boolean found1 = false;
							boolean found2 = false;
							for (int i = 0; i < C.length; i++)
							{  
								found1 = C[i].searchP(Pin);  
								found2 = C[i].searchN(NUMBER);
								if (found1 && found2 )
								{  
									C[i].showAccount();
									break;  
								}  
							}  
							if (!found2)
							{  
								System.out.println("\n\n--------------------------------------------!!!\n SEARCH FAILED..!!  INVALID MOBILE NUMBER..!!\n--------------------------------------------!!!\n\n");
							}
							else if(!found1)
							{
								System.out.println("\n\n-------------------!!!\nINVALID PIN..!!\n-------------------!!!\n\n");
							}  
							break; 
						}
					}
					break;
				}	
				
                case 3:
				{
                    System.out.print("\nENTER ACCOUNT NUMBER : ");  
                    sc.nextLine();
					long ac_no = sc.nextLong();
					System.out.print("ENTER PIN : ");
                    int Pin=sc.nextInt();
                    boolean found1 = false;
					boolean found2 = false;
                    for (int i = 0; i < C.length; i++)
					{  
                        found1 = C[i].searchA(ac_no);
                        found2 = C[i].searchP(Pin);  
                        if (found1 && found2)
						{  
                            C[i].deposit();  
                            break;  
                        }  
                    }  
                    if (!found1)
					{  
                        System.out.println("\n\n--------------------------------------------!!!\n SEARCH FAILED..!!  ACCOUNT DOESEN'T EXIST..!!\n--------------------------------------------!!!\n\n");
                    }
					else if(!found2)
					{
						System.out.println("\n\n-------------------!!!\nINVALID PIN..!!\n-------------------!!!\n\n");
					}  
                    break;  
				}
				
                case 4:
				{
                    System.out.print("\nENTER ACCOUNT NUMBER : ");  
                    sc.nextLine();
					long ac_no = sc.nextLong();
					System.out.print("ENTER PIN : ");
                    int Pin=sc.nextInt();
                    boolean found1 = false;
                    boolean found2 = false;
                    for (int i = 0; i < C.length; i++)
					{  
                        found1 = C[i].searchA(ac_no);
                        found2 = C[i].searchP(Pin);  
                        if (found1 && found2)
						{  
                            C[i].withdrawal();  
                            break;  
                        }  
                    }  
                    if (!found1)
					{  
                        System.out.println("\n\n--------------------------------------------!!!\n SEARCH FAILED..!!  ACCOUNT DOESEN'T EXIST..!!\n--------------------------------------------!!!\n\n");
                    }
					else if(!found2)
					{
						System.out.println("\n\n-------------------!!!\nINVALID PIN..!!\n-------------------!!!\n\n");
					}					
                    break;  
				}
				
				case 5:
				{
					System.out.print("\nENTER ACCOUNT NUMBER : ");  
                    sc.nextLine();
					long ac_no = sc.nextLong();
					System.out.print("ENTER PIN : ");
                    int Pin=sc.nextInt();
					boolean found1 = false;
					boolean found2 = false;					
                    for (int i = 0; i < C.length; i++)
					{  
                        found1 = C[i].searchA(ac_no);
                        found2 = C[i].searchP(Pin);  
                        if (found1 && found2)
						{  
                            C[i].Balance();  
                            break;  
                        }  
                    }  
                    if (!found1)
					{  
                        System.out.println("\n\n--------------------------------------------!!!\n SEARCH FAILED..!!  ACCOUNT DOESEN'T EXIST..!!\n--------------------------------------------!!!\n\n");
                    }
					else if(!found2)
					{
						System.out.println("\n\n-------------------!!!\nINVALID PIN..!!\n-------------------!!!\n\n");
					}  
                    break;
				}
				
				case 6:
				{
                    System.out.print("\nENTER ACCOUNT NUMBER : ");  
                    sc.nextLine();
					long ac_no = sc.nextLong();
					System.out.print("ENTER OLD PIN : ");
                    int Pin=sc.nextInt();
                    boolean found1 = false;
                    boolean found2 = false;
                    for (int i = 0; i < C.length; i++)
					{  
                        found1 = C[i].searchA(ac_no);
                        found2 = C[i].searchP(Pin);  
                        if (found1 && found2)
						{  
                            C[i].Change_PIN();  
                            break;  
                        }  
                    }  
                    if (!found1)
					{  
                        System.out.println("\n\n--------------------------------------------!!!\n SEARCH FAILED..!!  ACCOUNT DOESEN'T EXIST..!!\n--------------------------------------------!!!\n\n");
                    }  
					else if(!found2)
					{
						System.out.println("\n\n-------------------!!!\nINVALID PIN..!!\n-------------------!!!\n\n");
					}
                    break;	
				}
				
				case 7:
				{
					System.out.print("\nENTER ACCOUNT NUMBER : ");  
                    sc.nextLine();
					long ac_no = sc.nextLong();
					System.out.print("ENTER PIN : ");
                    int Pin=sc.nextInt();
					boolean found1 = false;
					boolean found2 = false;					
                    for (int i = 0; i < C.length; i++)
					{  
                        found1 = C[i].searchA(ac_no);
                        found2 = C[i].searchP(Pin);  
                        if (found1 && found2)
						{  
                            C[i].PreviousTrans();  
                            break;  
                        }  
                    }  
                    if (!found1)
					{  
                        System.out.println("\n\n--------------------------------------------!!!\n SEARCH FAILED..!!  ACCOUNT DOESEN'T EXIST..!!\n--------------------------------------------!!!\n\n");
                    }
					else if(!found2)
					{
						System.out.println("\n\n-------------------!!!\nINVALID PIN..!!\n-------------------!!!\n\n");
					}
                    break;
				}
				
				case 8:
				{
					System.out.println("\nENTER YOUR ACCOUNT NUMBER :");
					long ac_no1 = sc.nextLong();
					System.out.println("ENTER ACCOUNT NUMBER TO TRANSFER AMOUNT :");
					long ac_no2 = sc.nextLong();
					System.out.println("ENTER AMOUNT TO TRANSFER :");
                    long TA= sc.nextLong();
					System.out.print("ENTER PIN : ");
                    int Pin = sc.nextInt();
					boolean found1 = false;
					boolean found2 = false;
					boolean found3 = false;
					
					for (int i=0;i<C.length;i++)
					{  
						found1 = C[i].searchA(ac_no1);
                        found3 = C[i].searchP(Pin);
						
						for(int j=0;j<C.length;j++)  
						{
							found2 = C[j].searchA(ac_no2);
							if (found1 && found2 && found3)
							{  
								C[i].transfer(C[j],TA);
								break;  
							}
						}
					}
                    break;
				}
				
                case 9:
				{
                    System.out.println("\n-----------------------------------------------!!!\n THANK YOU FOR USING OUR BANKING SERVICES\n-----------------------------------------------!!!");
                    System.exit(0);
				}
				
				default:
				{
					System.out.println("PLESE ENTER VALID CHOISE..!!!");
					break;
				}
            }
        }
        while(true);
    }
}