
public class ZJ3 {


}

/*
class UF {
    int *id, cnt, *sz;

    public:
    UF( int N )
    {
        cnt	= N;
        id	= new int[N];
        sz	= new int[N];
        for ( int i = 0; i < N; i++ )
        {
            id[i]	= i;
            sz[i]	= 1;
        }
    }
	~UF()
    {
        delete[] id;
        delete[] sz;
    }


    int find( int p )
    {
        if ( p != id[p] )
        {
            id[p] = find( id[p] );
        }
        return(id[p]);
    }


    void merge( int x, int y )
    {
        int	i	= find( x );
        int	j	= find( y );
        if ( i == j )
            return;
        if ( sz[i] < sz[j] )
        {
            id[i]	= j;
            sz[j]	+= sz[i];
        }else  {
            id[j]	= i;
            sz[i]	+= sz[j];
        }
        cnt--;
    }
*/
/*

    bool connected( int x, int y )
    {
        return(find( x ) == find( y ) );
    }


    int count()
    {
        return(cnt);
    }
};

int main()
        {
        int n;
        scanf( "%d", &n );
        UF test( n + 10 );


        for ( int i = 0; i < n; ++i )
        {
        int now_use = i + 1;
        while ( true )
        {
        int now_son;
        scanf( "%d", &now_son );
        if ( now_son != 0 )
        {
        test.merge( now_use, now_son );
        }else  {
        break;
        }
        }
        }
        unordered_set<int>	check_repeat;
        int			ans = 0;
        for ( int i = 1; i <= n; ++i )
        {
        */
/* cout << test.find(i) << endl; *//*

        auto check = check_repeat.find( test.find( i ) );
        if ( check == check_repeat.end() )
        {
        ans += 1;
        check_repeat.insert( test.find( i ) );
        }
        }
        cout << check_repeat.size();
        return(0);
        }*/
