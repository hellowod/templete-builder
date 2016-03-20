package table

// table colum struct
type Colum struct {
	Type    string
	Field   string
	Comment string
}

// table single sheet
type Sheet struct {
	Name   string
	Colums []*Colum
}
