import java.util.*;
import java.io.*;
public class Animal extends Questions{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		if(q_a(2,"Is it a Mammal?").equals("yes")){
			if(q_a(3,"Does it have hooves?").equals("yes")){
				if(q_a(4,"Does it have antlers?").equals("yes")){
					if(q_a(5,"Does it have long legs?").equals("yes")){
						if(q_a(6,"Does it have a short tail?").equals("yes")){
							if(q_a(7,"Does it have sharp teeth?").equals("yes")){
								if(q_a(8,"").equals("yes")){
									if(q_a(9,"Is it large?").equals("yes")){
										if(q_a(10,"Is it large?").equals("yes")){
											if(q_a(11,"Is it large?").equals("yes")){
												if(q_a(12,"Is it large?").equals("yes")){
													if(q_a(13,"Is it large?").equals("yes")){
														if(q_a(14,"Is it large?").equals("yes")){
															if(q_a(15,"Is it large?").equals("yes")){
																if(q_a(16,"Is it large?").equals("yes")){
																	if(q_a(17,"Is it large?").equals("yes")){
																		if(q_a(18,"Is it large?").equals("yes")){
																			if(q_a(19,"Is it large?").equals("yes")){
																				if(q_a(20,"Is it large?").equals("yes")){
																					
																				}else{
																					
																				}
																			}else{
																				
																			}
																		}else{
																			
																		}
																	}else{
																		
																	}
																}else{
																	
																}
															}else{
																
															}
														}else{
															
														}
													}else{
														
													}
												}else{
													
												}
											}else{
												
											}
										}else{
											
										}
									}else{
										
									}
								}else{
									
								}
							}else{
								
							}
						}else{
							
						}
					}else{
						
					}
				}else{
					
				}
			}else{
				q_a(4,"Does it have an opposable thumb?");
			}
			
			
				
			
		}else if(q_a(3,"Is it a Reptile?").equals("yes")){
			
		}else if(q_a(4,"Is it a Rodent?").equals("yes")){
			
		}else if(q_a(5,"Is it an Insect?").equals("yes")){
			
		}else if(q_a(6,"Does it have legs?").equals("yes")){
			
		}else if(q_a(7,"Does it have a large tail?").equals("yes")){
			
		}else if(q_a(8,"Is it a Rodent?").equals("yes")){
			
		}else if(q_a(8,"Does it have wings?").equals("yes")){
			
		}
		
		
	}

	public static String q_a(int q_n, String s) throws IOException{
		
		String q=Questions.question_layout(s, q_n);
		Questions.array_saver(q_n, q);
		return ans_array[q_n];
	}

}