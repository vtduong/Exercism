def is_isogram(string):
	
	uniquueChars = []
	for char in string.lower():
		if char.isalpha():
			if char in uniquueChars:
				return False
			else: 
				uniquueChars.append(char)
	return True
