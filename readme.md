Begin

	prompt for customer name
	get name
	prompt for customer number
	get number
	prompt for usage
	get usage

	print customer name + customer number
	print your cost:
	if usage is greater than 200
		set cost to ((usage - 200)*8+2200/100) dollars
	else
		set cost to usage*11/100 dollars
	print cost dollars

END
	